package defpackage;

import com.snap.core.db.record.FriendWhoAddedMeModel;

/* renamed from: mci */
public interface mci extends ajfb<a> {

    /* renamed from: mci$a */
    public static abstract class a implements mis<mih, a> {

        /* renamed from: mci$a$b */
        public static abstract class b extends a {
            private final mih a;

            /* renamed from: mci$a$b$b */
            public static final class b extends b {
                private final mih a;

                public /* synthetic */ b() {
                    this(mih.e);
                }

                private b(mih mih) {
                    akcr.b(mih, "windowRect");
                    super(mih, (byte) 0);
                    this.a = mih;
                }

                public final mih a() {
                    return this.a;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mci.a.b.b) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.mci.a.b.b;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.mci.a.b.b) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mci$a$b$b.equals(java.lang.Object):boolean");
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
                    StringBuilder stringBuilder = new StringBuilder("Swipe(windowRect=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            /* renamed from: mci$a$b$a */
            public static final class a extends b {
                private final mih a;

                public /* synthetic */ a() {
                    this(mih.e);
                }

                private a(mih mih) {
                    akcr.b(mih, "windowRect");
                    super(mih, (byte) 0);
                    this.a = mih;
                }

                public final mih a() {
                    return this.a;
                }

                /* JADX WARNING: Missing block: B:4:0x0010, code skipped:
            if (defpackage.akcr.a(r1.a, ((defpackage.mci.a.b.a) r2).a) != false) goto L_0x0015;
     */
                public final boolean equals(java.lang.Object r2) {
                    /*
                    r1 = this;
                    if (r1 == r2) goto L_0x0015;
                L_0x0002:
                    r0 = r2 instanceof defpackage.mci.a.b.a;
                    if (r0 == 0) goto L_0x0013;
                L_0x0006:
                    r2 = (defpackage.mci.a.b.a) r2;
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
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.mci$a$b$a.equals(java.lang.Object):boolean");
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
                    return new a(obj);
                }

                public final String toString() {
                    StringBuilder stringBuilder = new StringBuilder("Capture(windowRect=");
                    stringBuilder.append(this.a);
                    stringBuilder.append(")");
                    return stringBuilder.toString();
                }
            }

            private b(mih mih) {
                super();
                this.a = mih;
            }

            public /* synthetic */ b(mih mih, byte b) {
                this(mih);
            }

            public mih a() {
                return this.a;
            }
        }

        /* renamed from: mci$a$a */
        public static final class a extends a {
            public static final a a = new a();

            private a() {
                super();
            }

            public final /* synthetic */ Object invoke(Object obj) {
                akcr.b((mih) obj, FriendWhoAddedMeModel.IGNORED);
                return this;
            }
        }

        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }
}
