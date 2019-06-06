package com.facebook.yoga;

import com.mapbox.mapboxsdk.constants.MapboxConstants;

public class YogaValue {
    private float a;
    private YogaUnit b;

    /* renamed from: com.facebook.yoga.YogaValue$1 */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a = new int[YogaUnit.values().length];

        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001f */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x002a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0014 */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        static {
            /*
            r0 = com.facebook.yoga.YogaUnit.values();
            r0 = r0.length;
            r0 = new int[r0];
            a = r0;
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = com.facebook.yoga.YogaUnit.UNDEFINED;	 Catch:{ NoSuchFieldError -> 0x0014 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0014 }
            r2 = 1;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0014 }
        L_0x0014:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = com.facebook.yoga.YogaUnit.POINT;	 Catch:{ NoSuchFieldError -> 0x001f }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x001f }
            r2 = 2;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x001f }
        L_0x001f:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = com.facebook.yoga.YogaUnit.PERCENT;	 Catch:{ NoSuchFieldError -> 0x002a }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x002a }
            r2 = 3;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x002a }
        L_0x002a:
            r0 = a;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = com.facebook.yoga.YogaUnit.AUTO;	 Catch:{ NoSuchFieldError -> 0x0035 }
            r1 = r1.ordinal();	 Catch:{ NoSuchFieldError -> 0x0035 }
            r2 = 4;
            r0[r1] = r2;	 Catch:{ NoSuchFieldError -> 0x0035 }
        L_0x0035:
            return;
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.yoga.YogaValue$AnonymousClass1.<clinit>():void");
        }
    }

    static {
        YogaValue yogaValue = new YogaValue(1.0E21f, YogaUnit.UNDEFINED);
        yogaValue = new YogaValue(MapboxConstants.MINIMUM_ZOOM, YogaUnit.POINT);
        yogaValue = new YogaValue(1.0E21f, YogaUnit.AUTO);
    }

    private YogaValue(float f, YogaUnit yogaUnit) {
        this.a = f;
        this.b = yogaUnit;
    }

    public boolean equals(Object obj) {
        if (obj instanceof YogaValue) {
            YogaValue yogaValue = (YogaValue) obj;
            YogaUnit yogaUnit = this.b;
            if (yogaUnit == yogaValue.b) {
                return yogaUnit == YogaUnit.UNDEFINED || Float.compare(this.a, yogaValue.a) == 0;
            }
        }
        return false;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.a) + this.b.mIntValue;
    }

    public String toString() {
        int i = AnonymousClass1.a[this.b.ordinal()];
        if (i == 1) {
            return "undefined";
        }
        if (i == 2) {
            return Float.toString(this.a);
        }
        if (i == 3) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("%");
            return stringBuilder.toString();
        } else if (i == 4) {
            return "auto";
        } else {
            throw new IllegalStateException();
        }
    }
}
