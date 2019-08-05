package com.example.dcl.androidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Rangamati extends AppCompatActivity {

    private TextView textView1,textView2,textView3,textView4,textView5,textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangamati);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        textView1=findViewById(R.id.rangamati1);
        textView2=findViewById(R.id.rangamati2);
        textView3=findViewById(R.id.rangamati3);
        textView4=findViewById(R.id.rangamati4);
        textView5=findViewById(R.id.rangamati5);
        textView6=findViewById(R.id.rangamati6);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
