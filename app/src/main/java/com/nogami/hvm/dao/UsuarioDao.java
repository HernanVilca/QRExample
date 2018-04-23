package com.nogami.hvm.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.nogami.hvm.db.DBconn;

/**
 * Created by nogami on 23/04/2018.
 */

public class UsuarioDao extends DBconn{

    DBconn con;
    Context contex;
    SQLiteDatabase db;
    Cursor cur;
    String sql;

    public UsuarioDao(Context context) {
        super(context);
        this.contex=context;
    }

    public boolean validarUsuario(String usuario, String clave){
        con=new DBconn(contex);
        db=con.getReadableDatabase();
        sql=" select * from usuario where usuario='"+usuario+"' and clave='"+clave+"'";
        cur=db.rawQuery(sql, null);
        if(cur.getCount()==1){
            return true;
        }else{
            return false;
        }
    }

    public Cursor listarUsuario(String usuario){
        con=new DBconn(contex);
        db=con.getReadableDatabase();
        sql=" select * from usuario where usuario='"+usuario+"'";
        cur=db.rawQuery(sql, null);
        return cur;
    }

}
