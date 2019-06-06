package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Parcelable;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.util.zzs;
import defpackage.caz;
import defpackage.cbq;
import defpackage.hf;

public final class FirebaseInstanceIdReceiver extends hf {
    private static caz a;
    private static caz b;

    private static synchronized caz a(Context context, String str) {
        synchronized (FirebaseInstanceIdReceiver.class) {
            caz caz;
            if ("com.google.firebase.MESSAGING_EVENT".equals(str)) {
                if (b == null) {
                    b = new caz(context, str);
                }
                caz = b;
                return caz;
            }
            if (a == null) {
                a = new caz(context, str);
            }
            caz = a;
            return caz;
        }
    }

    private final void a(Context context, Intent intent, String str) {
        String str2 = null;
        intent.setComponent(null);
        intent.setPackage(context.getPackageName());
        if (VERSION.SDK_INT <= 18) {
            intent.removeCategory(context.getPackageName());
        }
        String str3 = "gcm.rawData64";
        String stringExtra = intent.getStringExtra(str3);
        int i = 0;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra(str3);
        }
        stringExtra = "com.google.firebase.MESSAGING_EVENT";
        String str4 = "com.google.firebase.INSTANCE_ID_EVENT";
        if ("google.com/iid".equals(intent.getStringExtra("from")) || str4.equals(str)) {
            str2 = str4;
        } else if ("com.google.android.c2dm.intent.RECEIVE".equals(str) || stringExtra.equals(str)) {
            str2 = stringExtra;
        } else {
            Log.d("FirebaseInstanceId", "Unexpected intent");
        }
        int i2 = -1;
        if (str2 != null) {
            if (zzs.isAtLeastO() && context.getApplicationInfo().targetSdkVersion >= 26) {
                i = 1;
            }
            if (i != 0) {
                if (isOrderedBroadcast()) {
                    setResultCode(-1);
                }
                a(context, str2).a(intent, goAsync());
            } else {
                i2 = cbq.a().a(context, str2, intent);
            }
        }
        if (isOrderedBroadcast()) {
            setResultCode(i2);
        }
    }

    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
            if (parcelableExtra instanceof Intent) {
                a(context, (Intent) parcelableExtra, intent.getAction());
            } else {
                a(context, intent, intent.getAction());
            }
        }
    }
}
