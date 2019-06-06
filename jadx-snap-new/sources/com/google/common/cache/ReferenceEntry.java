package com.google.common.cache;

interface ReferenceEntry<K, V> {
    long getAccessTime();

    int getHash();

    K getKey();

    ReferenceEntry<K, V> getNext();

    ReferenceEntry<K, V> getNextInAccessQueue();

    ReferenceEntry<K, V> getNextInWriteQueue();

    ReferenceEntry<K, V> getPreviousInAccessQueue();

    ReferenceEntry<K, V> getPreviousInWriteQueue();

    ValueReference<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long j);

    void setNextInAccessQueue(ReferenceEntry<K, V> referenceEntry);

    void setNextInWriteQueue(ReferenceEntry<K, V> referenceEntry);

    void setPreviousInAccessQueue(ReferenceEntry<K, V> referenceEntry);

    void setPreviousInWriteQueue(ReferenceEntry<K, V> referenceEntry);

    void setValueReference(ValueReference<K, V> valueReference);

    void setWriteTime(long j);
}
