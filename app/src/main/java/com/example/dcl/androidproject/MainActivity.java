package com.example.dcl.androidproject;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

//    public String[] namelist;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //requestWindowFeature(Window.FEATURE_NO_TITLE);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        //namelist=getResources().getStringArray(R.array.name_list);

        listView=findViewById(R.id.listViewId);

        ArrayAdapter<String> adapter=new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,
                getResources().getStringArray(R.array.name_list));

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position==0){
                    Intent intent=new Intent(view.getContext(),ArchaeologicalPatterns.class);
                    startActivityForResult(intent,0);
                }
                if (position==1){
                    Intent intent=new Intent(view.getContext(),Sea_Beach.class);
                    startActivityForResult(intent,0);
                }
                if (position==2){
                    Intent intent=new Intent(view.getContext(),ForestsAndZoos.class);
                    startActivityForResult(intent,0);
                }
                if (position==3){
                    Intent intent=new Intent(view.getContext(),HistoricalPlaces.class);
                    startActivityForResult(intent,0);
                }
                if (position==4){
                    Intent intent=new Intent(view.getContext(),HilllsAndIslands.class);
                    startActivityForResult(intent,0);
                }
                if (position==5){
                    Intent intent=new Intent(view.getContext(),OtherInterestingPlaces.class);
                    startActivityForResult(intent,0);
                }

            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_layout,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId()==R.id.aboutId){
            Intent intent=new Intent(MainActivity.this,OptionMenu.class);
            startActivity(intent);
            return true;
        }
        if (item.getItemId()==R.id.settingId){
            Toast.makeText(MainActivity.this,"Setting clicked",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId()==R.id.shareId){
            Toast.makeText(MainActivity.this,"Share clicked",Toast.LENGTH_SHORT).show();
            return true;
        }
        if (item.getItemId()==R.id.feedbackId){
            Toast.makeText(MainActivity.this,"Feedback clicked",Toast.LENGTH_SHORT).show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
