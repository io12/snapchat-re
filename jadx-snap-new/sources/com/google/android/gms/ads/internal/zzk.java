package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.zzahd;
import com.google.android.gms.internal.zzahe;

final class zzk implements Runnable {
    private /* synthetic */ zzahe zzant;
    private /* synthetic */ zzi zzanz;

    zzk(zzi zzi, zzahe zzahe) {
        this.zzanz = zzi;
        this.zzant = zzahe;
    }

    public final void run() {
        this.zzanz.zzb(new zzahd(this.zzant, null, null, null, null, null, null, null));
    }
}
