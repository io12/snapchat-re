package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: abaq */
public final class abaq extends aban {
    private Boolean a;
    private Boolean b;

    private abaq b() {
        abaq abaq = (abaq) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            abaq.a = bool;
        }
        bool = this.b;
        if (bool != null) {
            abaq.b = bool;
        }
        return abaq;
    }

    public final /* synthetic */ aban a() {
        return b();
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("is_authorized", bool);
        }
        bool = this.b;
        if (bool != null) {
            hashMap.put("enable_bitmoji_access", bool);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final void b(Boolean bool) {
        this.b = bool;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((abaq) obj).asDictionary());
    }

    public final String getEventName() {
        return "SNAP_KIT_USER_REAUTHORIZE";
    }

    public final aavd getEventQoS() {
        return aavd.BUSINESS;
    }

    public final double getPerEventSamplingRate() {
        return 1.0d;
    }

    public final double getPerUserSamplingRate() {
        return 1.0d;
    }

    public final int hashCode() {
        int hashCode = super.hashCode() * 31;
        Boolean bool = this.a;
        int i = 0;
        hashCode = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        bool = this.b;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode + i;
    }
}
