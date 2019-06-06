package com.google.android.gms.internal;

import java.io.IOException;

public class zzfie extends IOException {
    private zzfjc zzpqo = null;

    public zzfie(String str) {
        super(str);
    }

    static zzfie zzdae() {
        return new zzfie("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static zzfie zzdaf() {
        return new zzfie("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static zzfie zzdag() {
        return new zzfie("CodedInputStream encountered a malformed varint.");
    }

    static zzfie zzdah() {
        return new zzfie("Protocol message contained an invalid tag (zero).");
    }

    static zzfie zzdai() {
        return new zzfie("Protocol message end-group tag did not match expected tag.");
    }

    static zzfif zzdaj() {
        return new zzfif("Protocol message tag had invalid wire type.");
    }

    static zzfie zzdak() {
        return new zzfie("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static zzfie zzdam() {
        return new zzfie("Protocol message had invalid UTF-8.");
    }

    public final zzfie zzi(zzfjc zzfjc) {
        this.zzpqo = zzfjc;
        return this;
    }
}
