package com.snap.core.db;

import defpackage.akbk;
import defpackage.akcs;

final class DbValidator$tagQueryFirst$2 extends akcs implements akbk<String> {
    final /* synthetic */ DbValidator this$0;

    DbValidator$tagQueryFirst$2(DbValidator dbValidator) {
        this.this$0 = dbValidator;
        super(0);
    }

    public final String invoke() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.this$0.getName());
        stringBuilder.append(":queryFirst");
        return stringBuilder.toString();
    }
}
