package com.snap.core.db;

import defpackage.akbk;
import defpackage.akcs;

final class SqliteDbClient$tagQueryMapList$2 extends akcs implements akbk<String> {
    final /* synthetic */ SqliteDbClient this$0;

    SqliteDbClient$tagQueryMapList$2(SqliteDbClient sqliteDbClient) {
        this.this$0 = sqliteDbClient;
        super(0);
    }

    public final String invoke() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.this$0.name);
        stringBuilder.append(":queryMapList");
        return stringBuilder.toString();
    }
}
