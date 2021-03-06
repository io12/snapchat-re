package net.sqlcipher.database;

import android.util.Log;

public abstract class SQLiteProgram extends SQLiteClosable {
    private static final String TAG = "SQLiteProgram";
    boolean mClosed = false;
    private SQLiteCompiledSql mCompiledSql;
    @Deprecated
    protected SQLiteDatabase mDatabase;
    final String mSql;
    @Deprecated
    protected long nHandle = 0;
    @Deprecated
    protected long nStatement = 0;

    SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str) {
        this.mDatabase = sQLiteDatabase;
        this.mSql = str.trim();
        sQLiteDatabase.acquireReference();
        sQLiteDatabase.addSQLiteClosable(this);
        this.nHandle = sQLiteDatabase.mNativeHandle;
        String substring = this.mSql.length() >= 6 ? this.mSql.substring(0, 6) : this.mSql;
        if (substring.equalsIgnoreCase("INSERT") || substring.equalsIgnoreCase("UPDATE") || substring.equalsIgnoreCase("REPLAC") || substring.equalsIgnoreCase("DELETE") || substring.equalsIgnoreCase("SELECT")) {
            StringBuilder stringBuilder;
            this.mCompiledSql = sQLiteDatabase.getCompiledStatementForSql(str);
            SQLiteCompiledSql sQLiteCompiledSql = this.mCompiledSql;
            String str2 = TAG;
            if (sQLiteCompiledSql == null) {
                this.mCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
                this.mCompiledSql.acquire();
                sQLiteDatabase.addToCompiledQueries(str, this.mCompiledSql);
                if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                    stringBuilder = new StringBuilder("Created DbObj (id#");
                    stringBuilder.append(this.mCompiledSql.nStatement);
                    substring = ") for sql: ";
                }
            } else if (!sQLiteCompiledSql.acquire()) {
                long j = this.mCompiledSql.nStatement;
                this.mCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
                if (SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION) {
                    stringBuilder = new StringBuilder("** possible bug ** Created NEW DbObj (id#");
                    stringBuilder.append(this.mCompiledSql.nStatement);
                    stringBuilder.append(") because the previously created DbObj (id#");
                    stringBuilder.append(j);
                    substring = ") was not released for sql:";
                }
            }
            stringBuilder.append(substring);
            stringBuilder.append(str);
            Log.v(str2, stringBuilder.toString());
        } else {
            this.mCompiledSql = new SQLiteCompiledSql(sQLiteDatabase, str);
        }
        this.nStatement = this.mCompiledSql.nStatement;
    }

    private final native void native_clear_bindings();

    private void releaseCompiledSqlIfNotInCache() {
        if (this.mCompiledSql != null) {
            synchronized (this.mDatabase.mCompiledQueries) {
                if (this.mDatabase.mCompiledQueries.containsValue(this.mCompiledSql)) {
                    this.mCompiledSql.release();
                } else {
                    this.mCompiledSql.releaseSqlStatement();
                    this.mCompiledSql = null;
                    this.nStatement = 0;
                }
            }
        }
    }

    public void bindBlob(int i, byte[] bArr) {
        if (bArr == null) {
            StringBuilder stringBuilder = new StringBuilder("the bind value at index ");
            stringBuilder.append(i);
            stringBuilder.append(" is null");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_blob(i, bArr);
            } finally {
                releaseReference();
            }
        } else {
            StringBuilder stringBuilder2 = new StringBuilder("database ");
            stringBuilder2.append(this.mDatabase.getPath());
            stringBuilder2.append(" already closed");
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    public void bindDouble(int i, double d) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_double(i, d);
            } finally {
                releaseReference();
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder("database ");
            stringBuilder.append(this.mDatabase.getPath());
            stringBuilder.append(" already closed");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void bindLong(int i, long j) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_long(i, j);
            } finally {
                releaseReference();
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder("database ");
            stringBuilder.append(this.mDatabase.getPath());
            stringBuilder.append(" already closed");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void bindNull(int i) {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_null(i);
            } finally {
                releaseReference();
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder("database ");
            stringBuilder.append(this.mDatabase.getPath());
            stringBuilder.append(" already closed");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void bindString(int i, String str) {
        if (str == null) {
            StringBuilder stringBuilder = new StringBuilder("the bind value at index ");
            stringBuilder.append(i);
            stringBuilder.append(" is null");
            throw new IllegalArgumentException(stringBuilder.toString());
        } else if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_bind_string(i, str);
            } finally {
                releaseReference();
            }
        } else {
            StringBuilder stringBuilder2 = new StringBuilder("database ");
            stringBuilder2.append(this.mDatabase.getPath());
            stringBuilder2.append(" already closed");
            throw new IllegalStateException(stringBuilder2.toString());
        }
    }

    public void clearBindings() {
        if (this.mClosed) {
            throw new IllegalStateException("program already closed");
        } else if (this.mDatabase.isOpen()) {
            acquireReference();
            try {
                native_clear_bindings();
            } finally {
                releaseReference();
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder("database ");
            stringBuilder.append(this.mDatabase.getPath());
            stringBuilder.append(" already closed");
            throw new IllegalStateException(stringBuilder.toString());
        }
    }

    public void close() {
        if (!this.mClosed && this.mDatabase.isOpen()) {
            this.mDatabase.lock();
            try {
                releaseReference();
                this.mClosed = true;
            } finally {
                this.mDatabase.unlock();
            }
        }
    }

    /* Access modifiers changed, original: protected */
    @Deprecated
    public void compile(String str, boolean z) {
    }

    /* Access modifiers changed, original: 0000 */
    public String getSqlString() {
        return this.mSql;
    }

    public final long getUniqueId() {
        return this.nStatement;
    }

    public final native void native_bind_blob(int i, byte[] bArr);

    public final native void native_bind_double(int i, double d);

    public final native void native_bind_long(int i, long j);

    public final native void native_bind_null(int i);

    public final native void native_bind_string(int i, String str);

    @Deprecated
    public final native void native_compile(String str);

    @Deprecated
    public final native void native_finalize();

    /* Access modifiers changed, original: protected */
    public void onAllReferencesReleased() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
        this.mDatabase.removeSQLiteClosable(this);
    }

    /* Access modifiers changed, original: protected */
    public void onAllReferencesReleasedFromContainer() {
        releaseCompiledSqlIfNotInCache();
        this.mDatabase.releaseReference();
    }
}
