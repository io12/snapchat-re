package defpackage;

import java.util.concurrent.Callable;

/* renamed from: dkr */
final class dkr implements Callable {
    private final /* synthetic */ akbk a;

    dkr(akbk akbk) {
        this.a = akbk;
    }

    public final /* synthetic */ Object call() {
        return this.a.invoke();
    }
}
