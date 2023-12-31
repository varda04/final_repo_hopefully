package com.example.navbarapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBHelper extends SQLiteOpenHelper {

    public static final String DB_NAME= "cummulative_db";
    public static final int DB_VERSION=1;
    private Context context;
    public DBHelper(@Nullable Context context) {

        super(context, DB_NAME, null, DB_VERSION);
        this.context=context;
    }




    @Override
    public void onCreate(SQLiteDatabase db) {
        //table creation
        String query = "create table Info(firstname text(20), lastname text(20), mobileno text(20))";
        db.execSQL(query);


        //complete add contacts page and come back to this
        //use same parameter names tho ( in add contact ) pls
        //dont worry, the error here will comment out after declaring "firstName" +2 variables in "add contact" page and linking them (or not)
//        public void insertContact(String firstName,
//        String lastName,
//        String mobileNo)
//        {
//            SQLiteDatabase sql= getWritableDatabase();
//            ContentValues c= new ContentValues();
//            c.put("firstname", firstName);
//            c.put("lastname", lastName);
//            c.put("mobileno", mobileNo);
//            //format: c.put("column_name", parameter name)
//            long id= sql.insert("info", null, c);
//            Log.d("test", id+""); //will log onto logcat
//
//        }
    }


        public void insertContact(String fName, String lName, String Number) {
        String fnamee= fName;
        String num= Number;
        String lnamee= lName;
            DBHelper d= new DBHelper(context);

            SQLiteDatabase sql= d.getWritableDatabase();
            ContentValues c= new ContentValues();

            c.put("firstname", fnamee);
            c.put("lastname", lnamee);
            c.put("mobileno", Number);

            long id= sql.insert("Info", null, c);
            Log.d("test", id+"");

        }



        //i forgor this, wills do later :)
//        public void deleteContact(){
            //deletion code----linked to "delete contact" page


//    }

    public ArrayList<Info> FetchFromSql(){
        ArrayList list1= new ArrayList<>();
        SQLiteDatabase db= getReadableDatabase();

        Cursor c= db.query("Info", null,null,null,null,null,null);
        if(c.getCount()>0){
            c.moveToFirst();
            while(!c.isAfterLast()){
                String fName= c.getString(c.getColumnIndexOrThrow("firstname"));
                String lName= c.getString(c.getColumnIndexOrThrow("lastname"));
                String mNo= c.getString(c.getColumnIndexOrThrow("mobileno"));

                Info inf= new Info();
                inf.firstName=fName;
                inf.lastName=lName;
                inf.mobileNo=mNo;


                list1.add(inf);
                c.moveToNext();
            }



        }
        return list1;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }



}
