package com.example.dhiaapc.e_learning;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.dhiaapc.e_learning.model.Enseignant;
import com.example.dhiaapc.e_learning.model.Etudiant;
import com.example.dhiaapc.e_learning.model.Perssone;
import com.example.dhiaapc.e_learning.model.Specialite;

import java.util.ArrayList;

public class db_elearning extends SQLiteOpenHelper {



    ///******************* constructeur pour cree bd ***********************//

    public db_elearning(Context context) {
        super(context, "compte.dp",null,1);
    }

    @Override

    //*********************** cree les table ***********************//
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table ens (id INTEGER PRIMARY KEY AUTOINCREMENT,nom text,prenom text,email text , password text,dep text)");
        db.execSQL("create table etud (id INTEGER PRIMARY KEY AUTOINCREMENT,nom text,prenom text,email text , password text,dep text)");
        db.execSQL("create table spec(id integer primary key autoincrement, nomSpec text, nmbModule int)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        //Drop User Table if exist
        db.execSQL("DROP TABLE IF EXISTS ens");
        db.execSQL("DROP TABLE IF EXISTS etud");
        db.execSQL("drop table if exists spec");

        // Create tables again
        onCreate(db);

    }

        //******************* methode insert spec *******************//

    public boolean insertSpec()
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues contentValues = new ContentValues();
        contentValues.put("id",1);
        contentValues.put("nomSpec", "informatique");
        contentValues.put("nmbModule",5);
        /*****************************/
        contentValues.put("id",2);
        contentValues.put("nomSpec", "mathematique");
        contentValues.put("nmbModule",5);
        /********************************************/
        contentValues.put("id",3);
        contentValues.put("nomSpec", "phezique");
        contentValues.put("nmbModule",5);
        /*******************************************/




        long ins = db.insert("spec", null, contentValues);

        if(ins == -1)
            return false;
        else
            return true;

        }





    //*********************** insert perssone ***********************//
    public boolean insert(Perssone perssone)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues content = new ContentValues();

        content.put("nom",perssone.getNom());
        content.put("prenom",perssone.getPrenom());
        content.put("password",perssone.getPassword());
        content.put("email",perssone.getemail());
        content.put("dep",perssone.getDep());


        long ins = db.insert("ens",null,content);
        if(ins == -1)
            return false;
        else
            return true;
    }

    //*********************** insert Enseinet ***********************//

    public boolean insertTeacher(Enseignant ens)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues content = new ContentValues();

        content.put("nom",ens.getNom());
        content.put("prenom",ens.getPrenom());
        content.put("password",ens.getPassword());
        content.put("email",ens.getemail());
        content.put("dep",ens.getDep());


        long ins = db.insert("ens",null,content);
        if(ins == -1)
            return false;
        else
            return true;
    }

    //*********************** insert etudiant ***********************//

    public boolean insertEtudiant(Etudiant etud)
    {
        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues content = new ContentValues();

        content.put("nom",etud.getNom());
        content.put("prenom",etud.getPrenom());
        content.put("password",etud.getPassword());
        content.put("email",etud.getemail());
        content.put("dep",etud.getDep());


        long ins = db.insert("etud",null,content);
        if(ins == -1)
            return false;
        else
            return true;
    }
//*********************** check email Enseignant ***********************//
    public boolean checkemailEns(String nom,String password)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("Select * from ens where nom =? and password=? ",
                new String[]{nom,password});
        if(cursor.getCount()>0)
            return false;
        else
            return true;

    }

    //*********************** check Acces Etudiant ***********************//
    public boolean checkemailEtd(String nom,String password)
    {
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.rawQuery("select * from etud where nom =? and password =? ",
                new String[]{nom, password});
        if(cursor.getCount()>0)
        return false;
        else
        return true;

    }
//**************************** methiode parcourir les spec from BD *******************************************//

  /*  public ArrayList<String> getSpec()
    {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.rawQuery("select * from spec",null);
        if(cursor.getCount()>0)
            return false;
        else
            return true;
    }*/


}

