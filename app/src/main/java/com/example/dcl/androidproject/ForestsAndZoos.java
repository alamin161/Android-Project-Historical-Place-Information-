package com.example.dcl.androidproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ForestsAndZoos extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forests_and_zoos);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        listView=findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ForestsAndZoos.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Forests_and_zoos));

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(ForestsAndZoos.this,"clicked",Toast.LENGTH_SHORT).show();
                if (position==0){
                    Intent intent=new Intent(view.getContext(),Sundarbans.class);
                    startActivityForResult(intent,0);
                }
                if (position==1){
                    Intent intent=new Intent(view.getContext(),Ratargul_Jolabon.class);
                    startActivityForResult(intent,0);
                }
            }
        });
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
