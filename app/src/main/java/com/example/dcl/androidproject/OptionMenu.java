package com.example.dcl.androidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class OptionMenu extends AppCompatActivity {

    private TextView textviewdevelop,textViewname,textViewid,textView2name,textView2id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_menu);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textviewdevelop=findViewById(R.id.textViewDevelopId);
        textViewname=findViewById(R.id.textViewNameId);
        textViewid=findViewById(R.id.textViewId);
        textView2name=findViewById(R.id.textViewName2Id);
        textView2id=findViewById(R.id.textView2Id);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
