package defpackage;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonWriter;

/* renamed from: afjv */
public final class afjv extends TypeAdapter<afju> {
    private final Gson a;

    public afjv(Gson gson) {
        this.a = gson;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x006d  */
    /* renamed from: a */
    public final defpackage.afju read(com.google.gson.stream.JsonReader r7) {
        /*
        r6 = this;
        r0 = r7.peek();
        r1 = com.google.gson.stream.JsonToken.NULL;
        if (r0 != r1) goto L_0x000d;
    L_0x0008:
        r7.nextNull();
        r7 = 0;
        return r7;
    L_0x000d:
        r0 = new afju;
        r0.<init>();
        r1 = 1;
        r7.setLenient(r1);
        r7.beginObject();
    L_0x0019:
        r2 = r7.hasNext();
        if (r2 == 0) goto L_0x008d;
    L_0x001f:
        r2 = r7.nextName();
        r3 = -1;
        r4 = r2.hashCode();
        r5 = -364975522; // 0xffffffffea3eea5e float:-5.770067E25 double:NaN;
        if (r4 == r5) goto L_0x003d;
    L_0x002d:
        r5 = 883310104; // 0x34a63e18 float:3.096509E-7 double:4.36413177E-315;
        if (r4 == r5) goto L_0x0033;
    L_0x0032:
        goto L_0x0047;
    L_0x0033:
        r4 = "lens_opportunity_request_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x003b:
        r2 = 1;
        goto L_0x0048;
    L_0x003d:
        r4 = "filter_opportunity_request_id";
        r2 = r2.equals(r4);
        if (r2 == 0) goto L_0x0047;
    L_0x0045:
        r2 = 0;
        goto L_0x0048;
    L_0x0047:
        r2 = -1;
    L_0x0048:
        if (r2 == 0) goto L_0x006d;
    L_0x004a:
        if (r2 == r1) goto L_0x0050;
    L_0x004c:
        r7.skipValue();
        goto L_0x0019;
    L_0x0050:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0059;
    L_0x0058:
        goto L_0x0075;
    L_0x0059:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0066;
    L_0x005d:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x006a;
    L_0x0066:
        r2 = r7.nextString();
    L_0x006a:
        r0.b = r2;
        goto L_0x0019;
    L_0x006d:
        r2 = r7.peek();
        r3 = com.google.gson.stream.JsonToken.NULL;
        if (r2 != r3) goto L_0x0079;
    L_0x0075:
        r7.nextNull();
        goto L_0x0019;
    L_0x0079:
        r3 = com.google.gson.stream.JsonToken.BOOLEAN;
        if (r2 != r3) goto L_0x0086;
    L_0x007d:
        r2 = r7.nextBoolean();
        r2 = java.lang.Boolean.toString(r2);
        goto L_0x008a;
    L_0x0086:
        r2 = r7.nextString();
    L_0x008a:
        r0.a = r2;
        goto L_0x0019;
    L_0x008d:
        r7.endObject();
        return r0;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afjv.read(com.google.gson.stream.JsonReader):afju");
    }

    /* renamed from: a */
    public final void write(JsonWriter jsonWriter, afju afju) {
        if (afju == null) {
            jsonWriter.nullValue();
            return;
        }
        jsonWriter.setLenient(true);
        jsonWriter.beginObject();
        if (afju.a != null) {
            jsonWriter.name("filter_opportunity_request_id");
            jsonWriter.value(afju.a);
        }
        if (afju.b != null) {
            jsonWriter.name("lens_opportunity_request_id");
            jsonWriter.value(afju.b);
        }
        jsonWriter.endObject();
    }
}
