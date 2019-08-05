package com.example.dcl.androidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Bandarban extends AppCompatActivity {

    private TextView textView1,textView2,textView3,textView4,textView5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bandarban);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textView1=findViewById(R.id.bandarban1);
        textView2=findViewById(R.id.bandarban2);
        textView3=findViewById(R.id.bandarban3);
        textView4=findViewById(R.id.bandarban4);
        textView5=findViewById(R.id.bandarban5);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
