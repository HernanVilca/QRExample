package com.nogami.hvm.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import pe.edu.upeu.dbexterno.ExternalSQLiteOpenHelper;

/**
 * Created by nogami on 23/04/2018.
 */

public class DBExterno extends ExternalSQLiteOpenHelper{

    public DBExterno(Context context) {
        super(context, "asistenciadb.db", null, 1);
    }
}
