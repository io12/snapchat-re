package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aahn */
public final class aahn extends abhw {
    private String a;
    private aaal b;
    private String c;

    private aahn a() {
        aahn aahn = (aahn) super.clone();
        String str = this.a;
        if (str != null) {
            aahn.a = str;
        }
        aaal aaal = this.b;
        if (aaal != null) {
            aahn.b = aaal;
        }
        str = this.c;
        if (str != null) {
            aahn.c = str;
        }
        return aahn;
    }

    public final void a(aaal aaal) {
        this.b = aaal;
    }

    public final void a(String str) {
        this.a = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        String str = this.a;
        if (str != null) {
            hashMap.put("crash_id", str);
        }
        aaal aaal = this.b;
        if (aaal != null) {
            hashMap.put("crash_category", aaal.toString());
        }
        str = this.c;
        if (str != null) {
            hashMap.put("error_message", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(String str) {
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aahn) obj).asDictionary());
    }

    public final String getEventName() {
        return "CRASH_REPORT_ERROR";
    }

    public final aavd getEventQoS() {
        return aavd.BEST_EFFORT;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        aaal aaal = this.b;
        hashCode = (hashCode + (aaal != null ? aaal.hashCode() : 0)) * 31;
        str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
