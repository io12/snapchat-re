package defpackage;

import java.util.Random;
import java.util.UUID;

/* renamed from: abpu */
public final class abpu {
    private static final Random a = new Random();

    public static UUID a() {
        return new UUID(a.nextLong(), a.nextLong());
    }
}
