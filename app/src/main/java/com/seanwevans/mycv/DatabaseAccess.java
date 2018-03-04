package com.seanwevans.mycv;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseAccess {
    private SQLiteOpenHelper openHelper;
    private SQLiteDatabase database;
    private static DatabaseAccess instance;

    private DatabaseAccess(Context context) {
        this.openHelper = new DatabaseOpenHelper(context);
    }

    // Return a singleton instance of DatabaseAccess.
    public static DatabaseAccess getInstance(Context context) {
        if (instance == null) {
            instance = new DatabaseAccess(context);
        }
        return instance;
    }

    // Open the database connection.
    public void open() {
        this.database = openHelper.getWritableDatabase();
    }

    // Close the database connection.
    public void close() {
        if (database != null) {
            this.database.close();
        }
    }

    // Read all entries from the database and return a List of entries
    public List<String> getAll(String sql_qry) {
        List<String> list = new ArrayList<>();
        Cursor cursor = database.rawQuery(sql_qry, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast()) {
            list.add(cursor.getString(0));
            cursor.moveToNext();
        }
        cursor.close();
        return list;
    }
}