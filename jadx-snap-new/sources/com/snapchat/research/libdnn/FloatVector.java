package com.snapchat.research.libdnn;

public class FloatVector {
    private transient long a;
    private transient boolean b;

    public FloatVector() {
        this(libdnnJNI.new_FloatVector__SWIG_0());
    }

    private FloatVector(long j) {
        this.b = true;
        this.a = j;
    }

    private synchronized void a() {
        if (this.a != 0) {
            if (this.b) {
                this.b = false;
                libdnnJNI.delete_FloatVector(this.a);
            }
            this.a = 0;
        }
    }

    /* Access modifiers changed, original: protected */
    public void finalize() {
        a();
    }
}