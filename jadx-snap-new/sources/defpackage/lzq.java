package defpackage;

import com.snap.core.db.record.FriendWhoAddedMeModel;

/* renamed from: lzq */
public interface lzq extends ajfb<b> {

    /* renamed from: lzq$b */
    public static abstract class b implements mis<mih, b> {

        /* renamed from: lzq$b$b */
        public static final class b extends b {
            public final mih a;

            public /* synthetic */ b() {
                this(mih.e);
            }

            private b(mih mih) {
                akcr.b(mih, "windowRect");
                super();
                this.a = mih;
            }

            /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.lzq.b.b) r2).a) != false) goto L_0x0015;
     */
            public final boolean equals(java.lang.Object r2) {
                /*
                r1 = this;
                if (r1 == r2) goto L_0x0015;
            L_0x0002:
                r0 = r2 instanceof defpackage.lzq.b.b;
                if (r0 == 0) goto L_0x0013;
            L_0x0006:
                r2 = (defpackage.lzq.b.b) r2;
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.lzq$b$b.equals(java.lang.Object):boolean");
            }

            public final int hashCode() {
                mih mih = this.a;
                return mih != null ? mih.hashCode() : 0;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                obj = (mih) obj;
                akcr.b(obj, "value");
                if ((akcr.a(this.a, obj) ^ 1) == 0) {
                    return this;
                }
                akcr.b(obj, "windowRect");
                return new b(obj);
            }

            public final String toString() {
                StringBuilder stringBuilder = new StringBuilder("Visible(windowRect=");
                stringBuilder.append(this.a);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        }

        /* renamed from: lzq$b$a */
        public static final class a extends b {
            public static final a a = new a();

            private a() {
                super();
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((mih) obj, FriendWhoAddedMeModel.IGNORED);
                return this;
            }
        }

        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }
    }

    /* renamed from: lzq$c */
    public static final class c implements ajfb<b>, lzq {
        public static final c a = new c();
        private static final ajdp<a> b;
        private final /* synthetic */ ajfb c = myr.a();

        static {
            Object a = ajvo.a(ajot.a);
            akcr.a(a, "Observable.empty()");
            b = a;
        }

        private c() {
        }

        public final ajdp<a> a() {
            return b;
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
            this.c.accept((b) obj);
        }
    }

    /* renamed from: lzq$a */
    public static abstract class a {

        /* renamed from: lzq$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    ajdp<a> a();
}
