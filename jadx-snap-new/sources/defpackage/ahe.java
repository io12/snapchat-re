package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: ahe */
public final class ahe extends FilterInputStream {
    private final long a;
    private int b;

    public ahe(InputStream inputStream, long j) {
        super(inputStream);
        this.a = j;
    }

    private int a(int i) {
        if (i >= 0) {
            this.b += i;
        } else if (this.a - ((long) this.b) > 0) {
            StringBuilder stringBuilder = new StringBuilder("Failed to read all expected data, expected: ");
            stringBuilder.append(this.a);
            stringBuilder.append(", but read: ");
            stringBuilder.append(this.b);
            throw new IOException(stringBuilder.toString());
        }
        return i;
    }

    public final synchronized int available() {
        return (int) Math.max(this.a - ((long) this.b), (long) this.in.available());
    }

    public final synchronized int read() {
        int read;
        read = super.read();
        a(read >= 0 ? 1 : -1);
        return read;
    }

    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public final synchronized int read(byte[] bArr, int i, int i2) {
        return a(super.read(bArr, i, i2));
    }
}
