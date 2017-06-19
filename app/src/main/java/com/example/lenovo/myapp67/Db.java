package com.example.lenovo.myapp67;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by lenovo on 2017/6/8.
 */

public class Db extends SQLiteOpenHelper {
    public Db(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
