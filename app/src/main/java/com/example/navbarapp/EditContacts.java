package com.example.navbarapp;

import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Map;

public class EditContacts extends AppCompatActivity {

    ArrayList list;
    ListView mainlist;
    TextView edtContacts;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_contacts);

//        String[] example=  new String[] {"Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace", "Hannah", "Isaac", "Jane",
//                "Katherine", "Liam", "Mia", "Noah", "Olivia", "Paul", "Quinn", "Rachel", "Samuel", "Tracy",
//                "Ursula", "Victor", "Wendy", "Xander", "Yasmine", "Zane",
//                "Sophia", "Ethan", "Ava", "Matthew", "Oliver", "Chloe", "Lily", "James", "Benjamin", "Emma",
//                "Luna", "Daniel", "Ella", "Samuel"};

        mainlist=findViewById(R.id.main_list);
        edtContacts=findViewById(R.id.viewcontact);



//        ArrayAdapter<String> listAdapter= new ArrayAdapter<>(this, R.layout.simple_spinner_dropdown_item, example);

//        mainlist.setAdapter(listAdapter);





    }

    @Override
    protected void onResume() {
        super.onResume();
        DBHelper db= new DBHelper(EditContacts.this);
//        DBHelper db= new DBHelper(EditContacts.this);
        db.insertContact("varda", "kannal", "1234");
//        db.insertContact("varda", "12");
        list= db.FetchFromSql();

        InfoAdapter adapter= new InfoAdapter(list, EditContacts.this);
        mainlist.setAdapter(adapter);

    }

//    @Override
//    public boolean onCreateOptionsMenu(Menu menu) {
//        MenuInflater inflater=
//        return super.onCreateOptionsMenu(menu);
//
//    }
}
