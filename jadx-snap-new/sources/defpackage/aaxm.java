package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: aaxm */
public final class aaxm extends abhw {
    private aaxp a;
    private aaua b;
    private String c;

    private aaxm a() {
        aaxm aaxm = (aaxm) super.clone();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            aaxm.a = aaxp;
        }
        aaua aaua = this.b;
        if (aaua != null) {
            aaxm.b = aaua;
        }
        String str = this.c;
        if (str != null) {
            aaxm.c = str;
        }
        return aaxm;
    }

    public final void a(aaua aaua) {
        this.b = aaua;
    }

    public final void a(aaxp aaxp) {
        this.a = aaxp;
    }

    public final void a(String str) {
        this.c = str;
    }

    public final Map<String, Object> asDictionary() {
        HashMap hashMap = new HashMap();
        aaxp aaxp = this.a;
        if (aaxp != null) {
            hashMap.put("registration_version", aaxp.toString());
        }
        aaua aaua = this.b;
        if (aaua != null) {
            hashMap.put("source", aaua.toString());
        }
        String str = this.c;
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
        return asDictionary().equals(((aaxm) obj).asDictionary());
    }

    public final String getEventName() {
        return "REGISTRATION_USER_USERNAME_PAGE_VIEW";
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
        aaxp aaxp = this.a;
        int i = 0;
        hashCode = (hashCode + (aaxp != null ? aaxp.hashCode() : 0)) * 31;
        aaua aaua = this.b;
        hashCode = (hashCode + (aaua != null ? aaua.hashCode() : 0)) * 31;
        String str = this.c;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }
}