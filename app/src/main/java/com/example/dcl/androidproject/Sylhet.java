package com.example.dcl.androidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Sylhet extends AppCompatActivity {

    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9,
    textView10,textView11,textView12,textView13,textView14,textView15,textView16,textView17,textView18,textView19,textView20;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        textView1=findViewById(R.id.sylhet1);
        textView2=findViewById(R.id.sylhet2);
        textView3=findViewById(R.id.sylhet3);
        textView4=findViewById(R.id.sylhet4);
        textView5=findViewById(R.id.sylhet5);
        textView6=findViewById(R.id.sylhet6);
        textView7=findViewById(R.id.sylhet7);
        textView8=findViewById(R.id.sylhet8);
        textView9=findViewById(R.id.sylhet9);
        textView10=findViewById(R.id.sylhet10);
        textView11=findViewById(R.id.sylhet11);
        textView12=findViewById(R.id.sylhet12);
        textView13=findViewById(R.id.sylhet13);
        textView14=findViewById(R.id.sylhet14);
        textView15=findViewById(R.id.sylhet15);
        textView16=findViewById(R.id.sylhet16);
        textView17=findViewById(R.id.sylhet17);
        textView18=findViewById(R.id.sylhet18);
        textView19=findViewById(R.id.sylhet19);
        textView20=findViewById(R.id.sylhet20);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
