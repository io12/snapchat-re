package android.support.v7.widget;

import android.support.v7.widget.RecyclerView.LayoutManager;
import android.support.v7.widget.RecyclerView.OnFlingListener;
import android.support.v7.widget.RecyclerView.OnScrollListener;
import android.support.v7.widget.RecyclerView.SmoothScroller;
import android.support.v7.widget.RecyclerView.SmoothScroller.Action;
import android.support.v7.widget.RecyclerView.SmoothScroller.ScrollVectorProvider;
import android.support.v7.widget.RecyclerView.State;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.Scroller;

public abstract class SnapHelper extends OnFlingListener {
    static final float MILLISECONDS_PER_INCH = 100.0f;
    private Scroller mGravityScroller;
    RecyclerView mRecyclerView;
    private final OnScrollListener mScrollListener = new OnScrollListener() {
        private boolean a = false;

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0 && this.a) {
                this.a = false;
                SnapHelper.this.snapToTargetExistingView();
            }
        }

        public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
            if (i != 0 || i2 != 0) {
                this.a = true;
            }
        }
    };

    private void destroyCallbacks() {
        this.mRecyclerView.removeOnScrollListener(this.mScrollListener);
        this.mRecyclerView.setOnFlingListener(null);
    }

    private void setupCallbacks() {
        if (this.mRecyclerView.getOnFlingListener() == null) {
            this.mRecyclerView.addOnScrollListener(this.mScrollListener);
            this.mRecyclerView.setOnFlingListener(this);
            return;
        }
        throw new IllegalStateException("An instance of OnFlingListener already set.");
    }

    private boolean snapFromFling(LayoutManager layoutManager, int i, int i2) {
        if (!(layoutManager instanceof ScrollVectorProvider)) {
            return false;
        }
        SmoothScroller createScroller = createScroller(layoutManager);
        if (createScroller == null) {
            return false;
        }
        i = findTargetSnapPosition(layoutManager, i, i2);
        if (i == -1) {
            return false;
        }
        createScroller.setTargetPosition(i);
        layoutManager.startSmoothScroll(createScroller);
        return true;
    }

    public void attachToRecyclerView(RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.mRecyclerView;
        if (recyclerView2 != recyclerView) {
            if (recyclerView2 != null) {
                destroyCallbacks();
            }
            this.mRecyclerView = recyclerView;
            if (this.mRecyclerView != null) {
                setupCallbacks();
                this.mGravityScroller = new Scroller(this.mRecyclerView.getContext(), new DecelerateInterpolator());
                snapToTargetExistingView();
            }
        }
    }

    public abstract int[] calculateDistanceToFinalSnap(LayoutManager layoutManager, View view);

    public int[] calculateScrollDistance(int i, int i2) {
        r0 = new int[2];
        this.mGravityScroller.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        r0[0] = this.mGravityScroller.getFinalX();
        r0[1] = this.mGravityScroller.getFinalY();
        return r0;
    }

    /* Access modifiers changed, original: protected */
    public SmoothScroller createScroller(LayoutManager layoutManager) {
        return createSnapScroller(layoutManager);
    }

    /* Access modifiers changed, original: protected */
    @Deprecated
    public LinearSmoothScroller createSnapScroller(LayoutManager layoutManager) {
        return !(layoutManager instanceof ScrollVectorProvider) ? null : new LinearSmoothScroller(this.mRecyclerView.getContext()) {
            /* Access modifiers changed, original: protected|final */
            public final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
                return SnapHelper.MILLISECONDS_PER_INCH / ((float) displayMetrics.densityDpi);
            }

            /* Access modifiers changed, original: protected|final */
            public final void onTargetFound(View view, State state, Action action) {
                if (SnapHelper.this.mRecyclerView != null) {
                    SnapHelper snapHelper = SnapHelper.this;
                    int[] calculateDistanceToFinalSnap = snapHelper.calculateDistanceToFinalSnap(snapHelper.mRecyclerView.getLayoutManager(), view);
                    int i = calculateDistanceToFinalSnap[0];
                    int i2 = calculateDistanceToFinalSnap[1];
                    int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i), Math.abs(i2)));
                    if (calculateTimeForDeceleration > 0) {
                        action.update(i, i2, calculateTimeForDeceleration, this.mDecelerateInterpolator);
                    }
                }
            }
        };
    }

    public abstract View findSnapView(LayoutManager layoutManager);

    public abstract int findTargetSnapPosition(LayoutManager layoutManager, int i, int i2);

    public boolean onFling(int i, int i2) {
        LayoutManager layoutManager = this.mRecyclerView.getLayoutManager();
        if (layoutManager == null || this.mRecyclerView.getAdapter() == null) {
            return false;
        }
        int minFlingVelocity = this.mRecyclerView.getMinFlingVelocity();
        return (Math.abs(i2) > minFlingVelocity || Math.abs(i) > minFlingVelocity) && snapFromFling(layoutManager, i, i2);
    }

    /* Access modifiers changed, original: 0000 */
    public void snapToTargetExistingView() {
        RecyclerView recyclerView = this.mRecyclerView;
        if (recyclerView != null) {
            LayoutManager layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                View findSnapView = findSnapView(layoutManager);
                if (findSnapView != null) {
                    int[] calculateDistanceToFinalSnap = calculateDistanceToFinalSnap(layoutManager, findSnapView);
                    if (!(calculateDistanceToFinalSnap[0] == 0 && calculateDistanceToFinalSnap[1] == 0)) {
                        this.mRecyclerView.smoothScrollBy(calculateDistanceToFinalSnap[0], calculateDistanceToFinalSnap[1]);
                    }
                }
            }
        }
    }
}
