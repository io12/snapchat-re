package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.internal.zzbgm;
import com.mapbox.mapboxsdk.constants.MapboxConstants;

public final class zzb implements Creator<FaceParcel> {
    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int zzd = zzbgm.zzd(parcel);
        LandmarkParcel[] landmarkParcelArr = null;
        int i = 0;
        int i2 = 0;
        float f = MapboxConstants.MINIMUM_ZOOM;
        float f2 = MapboxConstants.MINIMUM_ZOOM;
        float f3 = MapboxConstants.MINIMUM_ZOOM;
        float f4 = MapboxConstants.MINIMUM_ZOOM;
        float f5 = MapboxConstants.MINIMUM_ZOOM;
        float f6 = MapboxConstants.MINIMUM_ZOOM;
        float f7 = MapboxConstants.MINIMUM_ZOOM;
        float f8 = MapboxConstants.MINIMUM_ZOOM;
        float f9 = MapboxConstants.MINIMUM_ZOOM;
        while (parcel.dataPosition() < zzd) {
            int readInt = parcel.readInt();
            switch (65535 & readInt) {
                case 1:
                    i = zzbgm.zzg(parcel2, readInt);
                    break;
                case 2:
                    i2 = zzbgm.zzg(parcel2, readInt);
                    break;
                case 3:
                    f = zzbgm.zzl(parcel2, readInt);
                    break;
                case 4:
                    f2 = zzbgm.zzl(parcel2, readInt);
                    break;
                case 5:
                    f3 = zzbgm.zzl(parcel2, readInt);
                    break;
                case 6:
                    f4 = zzbgm.zzl(parcel2, readInt);
                    break;
                case 7:
                    f5 = zzbgm.zzl(parcel2, readInt);
                    break;
                case 8:
                    f6 = zzbgm.zzl(parcel2, readInt);
                    break;
                case 9:
                    landmarkParcelArr = (LandmarkParcel[]) zzbgm.zzb(parcel2, readInt, LandmarkParcel.CREATOR);
                    break;
                case 10:
                    f7 = zzbgm.zzl(parcel2, readInt);
                    break;
                case 11:
                    f8 = zzbgm.zzl(parcel2, readInt);
                    break;
                case 12:
                    f9 = zzbgm.zzl(parcel2, readInt);
                    break;
                default:
                    zzbgm.zzb(parcel2, readInt);
                    break;
            }
        }
        zzbgm.zzaf(parcel2, zzd);
        return new FaceParcel(i, i2, f, f2, f3, f4, f5, f6, landmarkParcelArr, f7, f8, f9);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new FaceParcel[i];
    }
}
