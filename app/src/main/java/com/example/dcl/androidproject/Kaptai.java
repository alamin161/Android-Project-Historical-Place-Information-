package com.example.dcl.androidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Kaptai extends AppCompatActivity {

    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,
            textView9,textView10,textView11,textView12,textView13,textView14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaptai);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textView1=findViewById(R.id.textView1);
        textView2=findViewById(R.id.textView2);
        textView3=findViewById(R.id.textView3);
        textView4=findViewById(R.id.textView4);
        textView5=findViewById(R.id.textView5);
        textView6=findViewById(R.id.textView6);
        textView7=findViewById(R.id.textView7);
        textView8=findViewById(R.id.textView8);
        textView9=findViewById(R.id.textView9);
        textView10=findViewById(R.id.textView10);
        textView11=findViewById(R.id.textView11);
        textView12=findViewById(R.id.textView12);
        textView13=findViewById(R.id.textView13);
        textView14=findViewById(R.id.textView14);

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
