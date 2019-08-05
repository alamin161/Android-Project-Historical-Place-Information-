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

public class HilllsAndIslands extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hillls_and_islands);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        listView=findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(HilllsAndIslands.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.hills_and_islands));

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(HilllsAndIslands.this,"clicked",Toast.LENGTH_SHORT).show();
                if (position==0){
                    Intent intent=new Intent(view.getContext(),Rangamati.class);
                    startActivityForResult(intent,0);
                }
                if (position==1){
                    Intent intent=new Intent(view.getContext(),Kaptai.class);
                    startActivityForResult(intent,0);
                }
                if (position==2){
                    Intent intent=new Intent(view.getContext(),Bandarban.class);
                    startActivityForResult(intent,0);
                }
                if (position==3){
                    Intent intent=new Intent(view.getContext(),Khagrachari.class);
                    startActivityForResult(intent,0);
                }
                if (position==4){
                    Intent intent=new Intent(view.getContext(),Mymensingh.class);
                    startActivityForResult(intent,0);
                }
                if (position==5){
                    Intent intent=new Intent(view.getContext(),Sylhet.class);
                    startActivityForResult(intent,0);
                }
                if (position==6){
                    Intent intent=new Intent(view.getContext(),Maheshkhali_Island.class);
                    startActivityForResult(intent,0);
                }
                if (position==7){
                    Intent intent=new Intent(view.getContext(),Sonadia_Island.class);
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
