package defpackage;

import com.google.common.base.Objects;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.snapchat.soju.android.SojuJsonAdapter;

@JsonAdapter(aezm.class)
@SojuJsonAdapter(a = aekr.class)
/* renamed from: aekq */
public class aekq extends aezl implements aezk {
    @SerializedName("token")
    public String a;

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof aekq)) {
            return false;
        }
        return Objects.equal(this.a, ((aekq) obj).a);
    }

    public int hashCode() {
        String str = this.a;
        return (str == null ? 0 : str.hashCode()) + 527;
    }
}
