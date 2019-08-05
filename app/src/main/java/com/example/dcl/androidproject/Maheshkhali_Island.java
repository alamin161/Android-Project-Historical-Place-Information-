package com.example.dcl.androidproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

public class Maheshkhali_Island extends AppCompatActivity {

    private TextView textView1,textView2,textView3,textView4,textView5,textView6,textView7,
               textView8,textView9,textView10,textView11,textView13;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maheshkhali__island);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textView1=findViewById(R.id.maheskhali1);
        textView2=findViewById(R.id.maheskhali2);
        textView3=findViewById(R.id.maheskhali3);
        textView4=findViewById(R.id.maheskhali4);
        textView5=findViewById(R.id.maheskhali5);
        textView6=findViewById(R.id.maheskhali6);
        textView7=findViewById(R.id.maheskhali7);
        textView8=findViewById(R.id.maheskhali8);
        textView9=findViewById(R.id.maheskhali9);
        textView10=findViewById(R.id.maheskhali10);
        textView11=findViewById(R.id.maheskhali11);
        textView13=findViewById(R.id.maheskhali13);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==android.R.id.home){
            this.finish();
        }

        return super.onOptionsItemSelected(item);
    }
}
