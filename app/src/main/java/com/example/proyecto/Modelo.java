package com.example.proyecto;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class Modelo {
    public SQLiteDatabase getConn(Context context){
        ConexionSQlite conn = new ConexionSQlite(context, "dbusuarios", null,1);
        SQLiteDatabase db = conn.getWritableDatabase();
        return db;
    }
    int insertarUsuarios(Context context, Usuarios usuarios){
        int res = 0;
        String sql = "INSERT INTO usuarios(nombre, email, contraseña) VALUES ('"+usuarios.getNombre()+"','"+usuarios.getEmail()+"','"+usuarios.getContraseña("1234")+"')";
        SQLiteDatabase db = this.getConn(context);
        try {
            db.execSQL(sql);
            res = 1;
        }catch (Exception e) {

        }
        return res;
    }
}
