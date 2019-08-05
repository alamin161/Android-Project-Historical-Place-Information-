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

public class HistoricalPlaces extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historical_places);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        listView=findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(HistoricalPlaces.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.Historical_places));

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(HistoricalPlaces.this,"clicked",Toast.LENGTH_SHORT).show();
                if (position==0){
                    Intent intent=new Intent(view.getContext(),Father_of_the_Nation.class);
                    startActivityForResult(intent,0);
                }
                if (position==1){
                    Intent intent=new Intent(view.getContext(),National_Memorial.class);
                    startActivityForResult(intent,0);
                }
                if (position==2){
                    Intent intent=new Intent(view.getContext(),Central_Shaheed_Minar.class);
                    startActivityForResult(intent,0);
                }
                if (position==3){
                    Intent intent=new Intent(view.getContext(),Martyr_intellectuals_memorials.class);
                    startActivityForResult(intent,0);
                }
                if (position==4){
                    Intent intent=new Intent(view.getContext(),National_poet_mausoleum.class);
                    startActivityForResult(intent,0);
                }
                if (position==5){
                    Intent intent=new Intent(view.getContext(),Curzon_Hall.class);
                    startActivityForResult(intent,0);
                }
                if (position==6){
                    Intent intent=new Intent(view.getContext(),Balda_Garden.class);
                    startActivityForResult(intent,0);
                }
                if (position==7){
                    Intent intent=new Intent(view.getContext(),Suhrawardy_Udyan.class);
                    startActivityForResult(intent,0);
                }
                if (position==8){
                    Intent intent=new Intent(view.getContext(),Old_High_Court_Building.class);
                    startActivityForResult(intent,0);
                }
                if (position==9){
                    Intent intent=new Intent(view.getContext(),Bahadur_shah_park.class);
                    startActivityForResult(intent,0);
                }
                if (position==10){
                    Intent intent=new Intent(view.getContext(),Dighapatiya_Rajbari.class);
                    startActivityForResult(intent,0);
                }
                if (position==11){
                    Intent intent=new Intent(view.getContext(),Second_World_War_cemetery.class);
                    startActivityForResult(intent,0);
                }
                if (position==12){
                    Intent intent=new Intent(view.getContext(),Shilaidaha_Kuthibari.class);
                    startActivityForResult(intent,0);
                }
                if (position==13){
                    Intent intent=new Intent(view.getContext(),Sagordari.class);
                    startActivityForResult(intent,0);
                }
                if (position==14){
                    Intent intent=new Intent(view.getContext(),Mujibnagar_Memorial_Museum.class);
                    startActivityForResult(intent,0);
                }
                if (position==15){
                    Intent intent=new Intent(view.getContext(),Trishal.class);
                    startActivityForResult(intent,0);
                }
                if (position==16){
                    Intent intent=new Intent(view.getContext(),Gandhi_Ashram.class);
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
