package com.example.navbarapp;



import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.navbarapp.DBHelper;
import android.content.Context;
import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//wtf do I do here- pls revise later :")
public class EditItemInfo extends AppCompatActivity {
    private DBHelper dbHelper;
    EditText edtname;
    EditText edtno;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_item_info);
        edtname=findViewById(R.id.edtName);
        edtno=findViewById(R.id.edtMobNo);








    }











}
