package com.example.jatrapoth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity3 extends AppCompatActivity {
private ListView myListVidew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Removing Title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        myListVidew = (ListView)findViewById(R.id.myListView);

        ArrayList<String> list = new ArrayList<String>();
        list.add("1. Asim");
        list.add("2. Projapoti");
        list.add("3. Poristhan");
        list.add("4. Rajdhani");
        list.add("5. Boshumoti");

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,list);

        myListVidew.setAdapter(arrayAdapter);

        myListVidew.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String str = ((TextView)view).getText().toString().trim();
                String [] arr = str.split(" ");
                String fnstr = "You Clicked On "+arr[1];
                Toast.makeText(MainActivity3.this, fnstr, Toast.LENGTH_LONG).show();

            }
        });


    }
}