package com.snap.ui.view.surfaceview;

import com.snap.ui.view.surfaceview.SurfaceViewManager.SurfaceViewRequest;
import defpackage.ajfb;

/* compiled from: lambda */
public final /* synthetic */ class -$$Lambda$SurfaceViewManager$F41AA2XAF-D9t86bMwTK4D9WeZQ implements ajfb {
    private final /* synthetic */ SurfaceViewManager f$0;

    public /* synthetic */ -$$Lambda$SurfaceViewManager$F41AA2XAF-D9t86bMwTK4D9WeZQ(SurfaceViewManager surfaceViewManager) {
        this.f$0 = surfaceViewManager;
    }

    public final void accept(Object obj) {
        this.f$0.removePendingRequest((SurfaceViewRequest) obj);
    }
}
