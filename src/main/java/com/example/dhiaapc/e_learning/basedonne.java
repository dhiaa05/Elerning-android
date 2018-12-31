package com.example.dhiaapc.e_learning;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class basedonne extends SQLiteOpenHelper {
    public basedonne(Context context) {
        super(context, "Loginapp.db", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table ens (email text primary key, password text)");
        db.execSQL("create table etud (id INTEGER PRIMARY KEY AUTOINCREMENT,nom text,prenom text,email text , password text,dep text)");

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("drop table if exists ens");
        db.execSQL("DROP TABLE IF EXISTS etud");

    }

    public boolean insert(String email, String password)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues content = new ContentValues();

        content.put("email", email);
        content.put("password",password);

        long ins = db.insert("ens",null,content);
        if(ins == -1)
            return false;
        else
            return true;
    }

    public boolean checkemail(String nom)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from ens where email=?",
                new String[]{nom});
        if(cursor.getCount()>0)
            return false;
            else
                return true;
    }
}
