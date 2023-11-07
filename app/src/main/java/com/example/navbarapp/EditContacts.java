package com.example.navbarapp;

import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class EditContacts extends AppCompatActivity {


    ListView mainlist;
    TextView edtContacts;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_contacts);

        String[] example=  new String[] {"Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace", "Hannah", "Isaac", "Jane",
                "Katherine", "Liam", "Mia", "Noah", "Olivia", "Paul", "Quinn", "Rachel", "Samuel", "Tracy",
                "Ursula", "Victor", "Wendy", "Xander", "Yasmine", "Zane",
                "Sophia", "Ethan", "Ava", "Matthew", "Oliver", "Chloe", "Lily", "James", "Benjamin", "Emma",
                "Luna", "Daniel", "Ella", "Samuel"};

        mainlist=findViewById(R.id.main_list);
        edtContacts=findViewById(R.id.viewcontact);
        ArrayAdapter<String> listAdapter= new ArrayAdapter<>(this, R.layout.simple_spinner_dropdown_item, example);

        mainlist.setAdapter(listAdapter);





    }
}
