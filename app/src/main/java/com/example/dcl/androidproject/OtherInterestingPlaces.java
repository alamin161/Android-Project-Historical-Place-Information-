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

public class OtherInterestingPlaces extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other_interesting_places);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);


        listView=findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(OtherInterestingPlaces.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.other_interesting_places));

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(OtherInterestingPlaces.this,"clicked",Toast.LENGTH_SHORT).show();
                if (position==0){
                    Intent intent=new Intent(view.getContext(),National_parliament_building.class);
                    startActivityForResult(intent,0);
                }
                if (position==1){
                    Intent intent=new Intent(view.getContext(),Bangabhaban.class);
                    startActivityForResult(intent,0);
                }
                if (position==2){
                    Intent intent=new Intent(view.getContext(),Shankaribazar.class);
                    startActivityForResult(intent,0);
                }
                if (position==3){
                    Intent intent=new Intent(view.getContext(),Sadarghat.class);
                    startActivityForResult(intent,0);
                }
                if (position==4){
                    Intent intent=new Intent(view.getContext(),Ramna_park.class);
                    startActivityForResult(intent,0);
                }
                if (position==5){
                    Intent intent=new Intent(view.getContext(),National_plant_garden.class);
                    startActivityForResult(intent,0);
                }
                if (position==6){
                    Intent intent=new Intent(view.getContext(),National_Zoo.class);
                    startActivityForResult(intent,0);
                }
                if (position==7){
                    Intent intent=new Intent(view.getContext(),National_park.class);
                    startActivityForResult(intent,0);
                }
                if (position==8){
                    Intent intent=new Intent(view.getContext(),Batali_hill.class);
                    startActivityForResult(intent,0);
                }
                if (position==9){
                    Intent intent=new Intent(view.getContext(),District_Administrator_Hill.class);
                    startActivityForResult(intent,0);
                }
                if (position==10){
                    Intent intent=new Intent(view.getContext(),Rajshahi.class);
                    startActivityForResult(intent,0);
                }
                if (position==11){
                    Intent intent=new Intent(view.getContext(),Jamuna_bridges.class);
                    startActivityForResult(intent,0);
                }
                if (position==12){
                    Intent intent=new Intent(view.getContext(),Madhavkunda.class);
                    startActivityForResult(intent,0);
                }
                if (position==13){
                    Intent intent=new Intent(view.getContext(),Jaflong.class);
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
