package com.example.navbarapp;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.navbarapp.DBHelper;
import android.content.Context;
//wtf do I do here- pls revise later :")
public class EditItemInfo {
    private DBHelper dbHelper;

    public EditItemInfo(Context context){
        dbHelper= new DBHelper(context);
    }
    SQLiteDatabase db= dbHelper.getReadableDatabase();
    String Name="";
    String MobileNo="";
    Cursor cursor= db.query("Info", new String[] {"firstName"})



}
