package com.example.navbarapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME= "cummulative_db";
    public static final int DB_VERSION=1;
    public DBHelper(@Nullable Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }




    @Override
    public void onCreate(SQLiteDatabase db) {
        //table creation
        String query= "create table info(firstname text(20), lastname text(20), mobileno text(20)";
        db.execSQL(query);


        //complete add contacts page and come back to this
        //use same parameter names tho ( in add contact ) pls
        //dont worry, the error here will comment out after declaring "firstName" +2 variables in "add contact" page and linking them (or not)
        public void insertContact(String firstName,
        String lastName,
        String mobileNo)
        {
            SQLiteDatabase sql= getWritableDatabase();
            ContentValues c= new ContentValues();
            c.put("firstname", firstName);
            c.put("lastname", lastName);
            c.put("mobileno", mobileNo);
            //format: c.put("column_name", parameter name)
            long id= sql.insert("info", null, c);
            Log.d("test", id+""); //will log onto logcat

        }


        //i forgor this, wills do later :)
        public void deleteContact(){
            //deletion code----linked to "delete contact" page
        }

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



}
