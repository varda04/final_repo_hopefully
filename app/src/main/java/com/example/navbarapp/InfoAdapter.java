package com.example.navbarapp;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class InfoAdapter extends BaseAdapter {

    ArrayList<Info> listofInfo;
    Context nContext;

    public InfoAdapter(ArrayList<Info> list, Context context){
        list=listofInfo;
        context=nContext;
    }

    @Override
    public int getCount() {
        return listofInfo.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView= View.inflate(nContext, R.layout.list_item_info, null);

        ImageView Call= convertView.findViewById(R.id.imgCall);
        ImageView Edit= convertView.findViewById(R.id.imgCall);

        TextView Name= convertView.findViewById(R.id.Name);
        TextView MobileNo= convertView.findViewById(R.id.Num);

        Call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(Intent.ACTION_CALL);
                i.setData(Uri.parse("tel:/"+listofInfo.get(position).mobileNo));
            }
        });

        Edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent()
            }
        });


        return null;
    }
}
