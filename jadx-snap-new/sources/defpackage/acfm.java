package defpackage;

import com.google.protobuf.nano.CodedInputByteBufferNano;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.ExtendableMessageNano;
import com.google.protobuf.nano.MessageNano;

/* renamed from: acfm */
public final class acfm extends ExtendableMessageNano<acfm> {
    private aceu a;

    public acfm() {
        this.a = null;
        this.unknownFieldData = null;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int computeSerializedSize = super.computeSerializedSize();
        aceu aceu = this.a;
        return aceu != null ? computeSerializedSize + CodedOutputByteBufferNano.computeMessageSize(1, aceu) : computeSerializedSize;
    }

    public final /* synthetic */ MessageNano mergeFrom(CodedInputByteBufferNano codedInputByteBufferNano) {
        while (true) {
            int readTag = codedInputByteBufferNano.readTag();
            if (readTag == 0) {
                return this;
            }
            if (readTag == 10) {
                if (this.a == null) {
                    this.a = new aceu();
                }
                codedInputByteBufferNano.readMessage(this.a);
            } else if (!storeUnknownField(codedInputByteBufferNano, readTag)) {
                return this;
            }
        }
    }

    public final void writeTo(CodedOutputByteBufferNano codedOutputByteBufferNano) {
        aceu aceu = this.a;
        if (aceu != null) {
            codedOutputByteBufferNano.writeMessage(1, aceu);
        }
        super.writeTo(codedOutputByteBufferNano);
    }
}
