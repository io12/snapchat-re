package com.google.android.gms.internal;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import org.json.JSONObject;

final class zzod extends zzny<String> {
    zzod(int i, String str, String str2) {
        super(i, str, str2, null);
    }

    public final /* synthetic */ Object zza(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(getKey(), (String) zzje());
    }

    public final /* synthetic */ void zza(Editor editor, Object obj) {
        editor.putString(getKey(), (String) obj);
    }

    public final /* synthetic */ Object zzb(JSONObject jSONObject) {
        return jSONObject.optString(getKey(), (String) zzje());
    }
}
