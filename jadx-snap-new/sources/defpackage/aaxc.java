package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaxc */
public final class aaxc extends aaxl {
    private Boolean a;
    private String b;

    private aaxc b() {
        aaxc aaxc = (aaxc) super.clone();
        Boolean bool = this.a;
        if (bool != null) {
            aaxc.a = bool;
        }
        String str = this.b;
        if (str != null) {
            aaxc.b = str;
        }
        return aaxc;
    }

    public final /* synthetic */ aaxl a() {
        return b();
    }

    public final void a(Boolean bool) {
        this.a = bool;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        Boolean bool = this.a;
        if (bool != null) {
            hashMap.put("searchable", bool);
        }
        String str = this.b;
        if (str != null) {
            hashMap.put("long_client_id", str);
        }
        hashMap.putAll(super.asDictionary());
        hashMap.put("event_name", getEventName());
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return asDictionary().equals(((aaxc) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_SET_SEARCHABILITY";
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
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}
