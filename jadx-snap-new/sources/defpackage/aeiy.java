package defpackage;

import java.util.Locale;

/* renamed from: aeiy */
public enum aeiy {
    SCISSORS_STICKER(r2),
    FACECUT_STICKER(r3),
    UNRECOGNIZED_VALUE(r4);
    
    private final String value;

    private aeiy(String str) {
        this.value = str;
    }

    public static aeiy a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return aeiy.valueOf(str.toUpperCase(Locale.US));
        } catch (Exception unused) {
            return UNRECOGNIZED_VALUE;
        }
    }

    public final String a() {
        return this.value;
    }

    public final String toString() {
        return this.value;
    }
}
