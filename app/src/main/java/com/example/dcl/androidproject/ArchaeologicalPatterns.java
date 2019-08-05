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

public class ArchaeologicalPatterns extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_archaeological_patterns);

        //adding back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        listView=findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(ArchaeologicalPatterns.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.archaeological_patterns));

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(ArchaeologicalPatterns.this,"clicked",Toast.LENGTH_SHORT).show();
                if (position==0){
                    Intent intent=new Intent(view.getContext(),Lalbagh_Fort.class);
                    startActivityForResult(intent,0);
                }
                if (position==1){
                    Intent intent=new Intent(view.getContext(),Mughal_Eidghah.class);
                    startActivityForResult(intent,0);
                }
                if (position==2){
                    Intent intent=new Intent(view.getContext(),Ahsan_Manjil.class);
                    startActivityForResult(intent,0);
                }
                if (position==3){
                    Intent intent=new Intent(view.getContext(),Sonargaon.class);
                    startActivityForResult(intent,0);
                }
                if (position==4){
                    Intent intent=new Intent(view.getContext(),Wari_Bateshwar.class);
                    startActivityForResult(intent,0);
                }
                if (position==5){
                    Intent intent=new Intent(view.getContext(),Mainamoti.class);
                    startActivityForResult(intent,0);
                }
                if (position==6){
                    Intent intent=new Intent(view.getContext(),Paharpur_Buddhist_Bihar.class);
                    startActivityForResult(intent,0);
                }
                if (position==7){
                    Intent intent=new Intent(view.getContext(),Mahasthangarh.class);
                    startActivityForResult(intent,0);
                }
                if (position==8){
                    Intent intent=new Intent(view.getContext(),Kantaji_Temple.class);
                    startActivityForResult(intent,0);
                }
                if (position==9){
                    Intent intent=new Intent(view.getContext(),Sixty_Dome_Mosque.class);
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
