package com.google.android.gms.internal;

import android.os.RemoteException;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.ads.formats.NativeAd.AdChoicesInfo;
import com.google.android.gms.ads.formats.NativeAd.Image;
import com.google.android.gms.ads.formats.NativeContentAd;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.ArrayList;
import java.util.List;

@zzabh
public final class zzrn extends NativeContentAd {
    private final VideoController zzbjt = new VideoController();
    private final List<Image> zzcak = new ArrayList();
    private final AdChoicesInfo zzcam;
    private final zzrk zzcan;
    private final zzqv zzcao;

    /* JADX WARNING: Removed duplicated region for block: B:39:0x0022 A:{SYNTHETIC} */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c A:{Catch:{ RemoteException -> 0x0057 }} */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0078 A:{Catch:{ RemoteException -> 0x0085 }} */
    public zzrn(com.google.android.gms.internal.zzrk r6) {
        /*
        r5 = this;
        r0 = "Failed to get image.";
        r5.<init>();
        r1 = new java.util.ArrayList;
        r1.<init>();
        r5.zzcak = r1;
        r1 = new com.google.android.gms.ads.VideoController;
        r1.<init>();
        r5.zzbjt = r1;
        r5.zzcan = r6;
        r6 = 0;
        r1 = r5.zzcan;	 Catch:{ RemoteException -> 0x0057 }
        r1 = r1.getImages();	 Catch:{ RemoteException -> 0x0057 }
        if (r1 == 0) goto L_0x005b;
    L_0x001e:
        r1 = r1.iterator();	 Catch:{ RemoteException -> 0x0057 }
    L_0x0022:
        r2 = r1.hasNext();	 Catch:{ RemoteException -> 0x0057 }
        if (r2 == 0) goto L_0x005b;
    L_0x0028:
        r2 = r1.next();	 Catch:{ RemoteException -> 0x0057 }
        r3 = r2 instanceof android.os.IBinder;	 Catch:{ RemoteException -> 0x0057 }
        if (r3 == 0) goto L_0x0049;
    L_0x0030:
        r2 = (android.os.IBinder) r2;	 Catch:{ RemoteException -> 0x0057 }
        if (r2 == 0) goto L_0x0049;
    L_0x0034:
        r3 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage";
        r3 = r2.queryLocalInterface(r3);	 Catch:{ RemoteException -> 0x0057 }
        r4 = r3 instanceof com.google.android.gms.internal.zzqs;	 Catch:{ RemoteException -> 0x0057 }
        if (r4 == 0) goto L_0x0042;
    L_0x003e:
        r2 = r3;
        r2 = (com.google.android.gms.internal.zzqs) r2;	 Catch:{ RemoteException -> 0x0057 }
        goto L_0x004a;
    L_0x0042:
        r3 = new com.google.android.gms.internal.zzqu;	 Catch:{ RemoteException -> 0x0057 }
        r3.<init>(r2);	 Catch:{ RemoteException -> 0x0057 }
        r2 = r3;
        goto L_0x004a;
    L_0x0049:
        r2 = r6;
    L_0x004a:
        if (r2 == 0) goto L_0x0022;
    L_0x004c:
        r3 = r5.zzcak;	 Catch:{ RemoteException -> 0x0057 }
        r4 = new com.google.android.gms.internal.zzqv;	 Catch:{ RemoteException -> 0x0057 }
        r4.<init>(r2);	 Catch:{ RemoteException -> 0x0057 }
        r3.add(r4);	 Catch:{ RemoteException -> 0x0057 }
        goto L_0x0022;
    L_0x0057:
        r1 = move-exception;
        com.google.android.gms.internal.zzaky.zzb(r0, r1);
    L_0x005b:
        r1 = r5.zzcan;	 Catch:{ RemoteException -> 0x0069 }
        r1 = r1.zzkj();	 Catch:{ RemoteException -> 0x0069 }
        if (r1 == 0) goto L_0x006d;
    L_0x0063:
        r2 = new com.google.android.gms.internal.zzqv;	 Catch:{ RemoteException -> 0x0069 }
        r2.<init>(r1);	 Catch:{ RemoteException -> 0x0069 }
        goto L_0x006e;
    L_0x0069:
        r1 = move-exception;
        com.google.android.gms.internal.zzaky.zzb(r0, r1);
    L_0x006d:
        r2 = r6;
    L_0x006e:
        r5.zzcao = r2;
        r0 = r5.zzcan;	 Catch:{ RemoteException -> 0x0085 }
        r0 = r0.zzki();	 Catch:{ RemoteException -> 0x0085 }
        if (r0 == 0) goto L_0x008b;
    L_0x0078:
        r0 = new com.google.android.gms.internal.zzqr;	 Catch:{ RemoteException -> 0x0085 }
        r1 = r5.zzcan;	 Catch:{ RemoteException -> 0x0085 }
        r1 = r1.zzki();	 Catch:{ RemoteException -> 0x0085 }
        r0.<init>(r1);	 Catch:{ RemoteException -> 0x0085 }
        r6 = r0;
        goto L_0x008b;
    L_0x0085:
        r0 = move-exception;
        r1 = "Failed to get attribution info.";
        com.google.android.gms.internal.zzaky.zzb(r1, r0);
    L_0x008b:
        r5.zzcam = r6;
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.zzrn.<init>(com.google.android.gms.internal.zzrk):void");
    }

    private final IObjectWrapper zzkd() {
        try {
            return this.zzcan.zzkd();
        } catch (RemoteException e) {
            zzaky.zzb("Failed to retrieve native ad engine.", e);
            return null;
        }
    }

    public final CharSequence getAdvertiser() {
        try {
            return this.zzcan.getAdvertiser();
        } catch (RemoteException e) {
            zzaky.zzb("Failed to get attribution.", e);
            return null;
        }
    }

    public final CharSequence getBody() {
        try {
            return this.zzcan.getBody();
        } catch (RemoteException e) {
            zzaky.zzb("Failed to get body.", e);
            return null;
        }
    }

    public final CharSequence getCallToAction() {
        try {
            return this.zzcan.getCallToAction();
        } catch (RemoteException e) {
            zzaky.zzb("Failed to get call to action.", e);
            return null;
        }
    }

    public final CharSequence getHeadline() {
        try {
            return this.zzcan.getHeadline();
        } catch (RemoteException e) {
            zzaky.zzb("Failed to get headline.", e);
            return null;
        }
    }

    public final List<Image> getImages() {
        return this.zzcak;
    }

    public final Image getLogo() {
        return this.zzcao;
    }

    public final VideoController getVideoController() {
        try {
            if (this.zzcan.getVideoController() != null) {
                this.zzbjt.zza(this.zzcan.getVideoController());
            }
        } catch (RemoteException e) {
            zzaky.zzb("Exception occurred while getting video controller", e);
        }
        return this.zzbjt;
    }

    public final /* synthetic */ Object zzbi() {
        return zzkd();
    }
}
