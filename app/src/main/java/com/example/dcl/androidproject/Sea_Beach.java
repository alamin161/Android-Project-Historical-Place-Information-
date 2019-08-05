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

public class Sea_Beach extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sea__beach);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        listView=findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(Sea_Beach.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.sea_beach));

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(Sea_Beach.this,"clicked",Toast.LENGTH_SHORT).show();
                if (position==0){
                    Intent intent=new Intent(view.getContext(),Kotka.class);
                    startActivityForResult(intent,0);
                }
                if (position==0){
                    Intent intent=new Intent(view.getContext(),Kuakata.class);
                    startActivityForResult(intent,0);
                }
                if (position==0){
                    Intent intent=new Intent(view.getContext(),Saint_Martin_Island.class);
                    startActivityForResult(intent,0);
                }
                if (position==0){
                    Intent intent=new Intent(view.getContext(),Teknaf.class);
                    startActivityForResult(intent,0);
                }
                if (position==0){
                    Intent intent=new Intent(view.getContext(),Coxs_Bazar.class);
                    startActivityForResult(intent,0);
                }
                if (position==0){
                    Intent intent=new Intent(view.getContext(),Parkee.class);
                    startActivityForResult(intent,0);
                }
                if (position==0){
                    Intent intent=new Intent(view.getContext(),Patenga_Beach.class);
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
