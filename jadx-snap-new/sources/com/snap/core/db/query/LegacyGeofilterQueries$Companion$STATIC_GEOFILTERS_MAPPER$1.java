package com.snap.core.db.query;

import com.snap.core.db.column.GeofilterType;
import defpackage.ahyg.a;
import defpackage.akcf;
import defpackage.akcq;
import defpackage.akde;
import defpackage.akej;

final class LegacyGeofilterQueries$Companion$STATIC_GEOFILTERS_MAPPER$1 extends akcq implements akcf<Long, GeofilterType, String, Long, Long, Boolean, a, Boolean, AutoValue_LegacyGeofilterQueries_StaticGeofilters> {
    public static final LegacyGeofilterQueries$Companion$STATIC_GEOFILTERS_MAPPER$1 INSTANCE = new LegacyGeofilterQueries$Companion$STATIC_GEOFILTERS_MAPPER$1();

    LegacyGeofilterQueries$Companion$STATIC_GEOFILTERS_MAPPER$1() {
        super(8);
    }

    public final String getName() {
        return "<init>";
    }

    public final akej getOwner() {
        return akde.a(AutoValue_LegacyGeofilterQueries_StaticGeofilters.class);
    }

    public final String getSignature() {
        return "<init>(JLcom/snap/core/db/column/GeofilterType;Ljava/lang/String;JJZLcom/snapchat/soju/android/unlockables/AutoStacking$AutoStackType;Z)V";
    }

    public final AutoValue_LegacyGeofilterQueries_StaticGeofilters invoke(long j, GeofilterType geofilterType, String str, long j2, long j3, boolean z, a aVar, boolean z2) {
        return new AutoValue_LegacyGeofilterQueries_StaticGeofilters(j, geofilterType, str, j2, j3, z, aVar, z2);
    }
}
