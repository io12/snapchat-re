package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;

public final class ConstructorConstructor {
    private final Map<Type, InstanceCreator<?>> instanceCreators;

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map) {
        this.instanceCreators = map;
    }

    private <T> ObjectConstructor<T> newDefaultConstructor(Class<? super T> cls) {
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(new Class[0]);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return new ObjectConstructor<T>() {
                public T construct() {
                    StringBuilder stringBuilder;
                    String str = " with no args";
                    String str2 = "Failed to invoke ";
                    try {
                        str = declaredConstructor.newInstance(null);
                        return str;
                    } catch (InstantiationException e) {
                        stringBuilder = new StringBuilder(str2);
                        stringBuilder.append(declaredConstructor);
                        stringBuilder.append(str);
                        throw new RuntimeException(stringBuilder.toString(), e);
                    } catch (InvocationTargetException e2) {
                        stringBuilder = new StringBuilder(str2);
                        stringBuilder.append(declaredConstructor);
                        stringBuilder.append(str);
                        throw new RuntimeException(stringBuilder.toString(), e2.getTargetException());
                    } catch (IllegalAccessException e3) {
                        throw new AssertionError(e3);
                    }
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private <T> ObjectConstructor<T> newDefaultImplementationConstructor(final Type type, Class<? super T> cls) {
        return Collection.class.isAssignableFrom(cls) ? SortedSet.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() {
            public T construct() {
                return new TreeSet();
            }
        } : EnumSet.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() {
            public T construct() {
                Type type = type;
                String str = "Invalid EnumSet type: ";
                StringBuilder stringBuilder;
                if (type instanceof ParameterizedType) {
                    type = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type instanceof Class) {
                        return EnumSet.noneOf((Class) type);
                    }
                    stringBuilder = new StringBuilder(str);
                    stringBuilder.append(type.toString());
                    throw new JsonIOException(stringBuilder.toString());
                }
                stringBuilder = new StringBuilder(str);
                stringBuilder.append(type.toString());
                throw new JsonIOException(stringBuilder.toString());
            }
        } : Set.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() {
            public T construct() {
                return new LinkedHashSet();
            }
        } : Queue.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() {
            public T construct() {
                return new ArrayDeque();
            }
        } : new ObjectConstructor<T>() {
            public T construct() {
                return new ArrayList();
            }
        } : Map.class.isAssignableFrom(cls) ? ConcurrentNavigableMap.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() {
            public T construct() {
                return new ConcurrentSkipListMap();
            }
        } : ConcurrentMap.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() {
            public T construct() {
                return new ConcurrentHashMap();
            }
        } : SortedMap.class.isAssignableFrom(cls) ? new ObjectConstructor<T>() {
            public T construct() {
                return new TreeMap();
            }
        } : (!(type instanceof ParameterizedType) || String.class.isAssignableFrom(TypeToken.get(((ParameterizedType) type).getActualTypeArguments()[0]).getRawType())) ? new ObjectConstructor<T>() {
            public T construct() {
                return new LinkedTreeMap();
            }
        } : new ObjectConstructor<T>() {
            public T construct() {
                return new LinkedHashMap();
            }
        } : null;
    }

    private <T> ObjectConstructor<T> newUnsafeAllocator(final Type type, final Class<? super T> cls) {
        return new ObjectConstructor<T>() {
            private final UnsafeAllocator unsafeAllocator = UnsafeAllocator.create();

            public T construct() {
                try {
                    return this.unsafeAllocator.newInstance(cls);
                } catch (Exception e) {
                    StringBuilder stringBuilder = new StringBuilder("Unable to invoke no-args constructor for ");
                    stringBuilder.append(type);
                    stringBuilder.append(". Register an InstanceCreator with Gson for this type may fix this problem.");
                    throw new RuntimeException(stringBuilder.toString(), e);
                }
            }
        };
    }

    public final <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
        final Type type = typeToken.getType();
        Class rawType = typeToken.getRawType();
        final InstanceCreator instanceCreator = (InstanceCreator) this.instanceCreators.get(type);
        if (instanceCreator != null) {
            return new ObjectConstructor<T>() {
                public T construct() {
                    return instanceCreator.createInstance(type);
                }
            };
        }
        instanceCreator = (InstanceCreator) this.instanceCreators.get(rawType);
        if (instanceCreator != null) {
            return new ObjectConstructor<T>() {
                public T construct() {
                    return instanceCreator.createInstance(type);
                }
            };
        }
        ObjectConstructor newDefaultConstructor = newDefaultConstructor(rawType);
        if (newDefaultConstructor != null) {
            return newDefaultConstructor;
        }
        newDefaultConstructor = newDefaultImplementationConstructor(type, rawType);
        return newDefaultConstructor != null ? newDefaultConstructor : newUnsafeAllocator(type, rawType);
    }

    public final String toString() {
        return this.instanceCreators.toString();
    }
}
