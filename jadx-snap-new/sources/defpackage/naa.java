package defpackage;

import android.view.MotionEvent;
import android.view.View;

/* renamed from: naa */
public interface naa extends mhu<a, b> {

    /* renamed from: naa$b */
    public static abstract class b {

        /* renamed from: naa$b$a */
        public static abstract class a extends b {

            /* renamed from: naa$b$a$a */
            public static final class a extends a {
                public static final a a = new a();

                private a() {
                    super();
                }
            }

            /* renamed from: naa$b$a$b */
            public static final class b extends a {
                final akbw<View, MotionEvent, Boolean> a;

                public b(akbw<? super View, ? super MotionEvent, Boolean> akbw) {
                    akcr.b(akbw, "touchHandler");
                    super();
                    this.a = akbw;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.naa.b.a.b) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.naa.b.a.b;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.naa.b.a.b) r2;
                    r0 = r1.a;
                    r2 = r2.a;
                    r2 = defpackage.akcr.a(r0, r2);
                    if (r2 == 0) goto L_0x0013;
                L_0x0012:
                    goto L_0x0015;
                L_0x0013:
                    r2 = 0;
                    return r2;
                L_0x0015:
                    r2 = 1;
                    return r2;
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.naa$b$a$b.equals(java.lang.Object):boolean");
                }

                public final int hashCode() {
                    akbw akbw = this.a;
                    return akbw != null ? akbw.hashCode() : 0;
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Interactive(touchHandler=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            private a() {
                super();
            }

            public /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: naa$b$b */
        public static final class b extends b {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: naa$a */
    public static abstract class a {

        /* renamed from: naa$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        /* renamed from: naa$a$b */
        public static final class b extends a {
            public static final b a = new b();

            private b() {
                super();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
