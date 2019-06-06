package defpackage;

import java.util.Locale;

/* renamed from: agii */
public enum agii {
    ICON(r2),
    SMALL(r3),
    MEDIUM(r4),
    LARGE(r5),
    ORIGINAL(r6),
    UNRECOGNIZED_VALUE(r7);
    
    private final String value;

    private agii(String str) {
        this.value = str;
    }

    public static agii a(String str) {
        if (str == null) {
            return UNRECOGNIZED_VALUE;
        }
        try {
            return agii.valueOf(str.toUpperCase(Locale.US));
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