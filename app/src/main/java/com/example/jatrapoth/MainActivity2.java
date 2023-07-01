package com.example.jatrapoth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {
private Button btn,btn2,btn3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Removing Title
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String[] items =  {"Mirpur 1","Mirpur 2","Mirpur 6","Mirpur 10","Mirpur 11","Mirpur 12","Kalshi","Mati Kata","Mirpur 6","Mirpur 11"};
        String[] buses =  {"Asim","Bahon","Tans Silva","Projapoti","Poristha","Rajdhani","Al Makka","Nur E Makka","Akik","Boshumoti"};
        btn = (Button) findViewById(R.id.button3);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button6);


        AutoCompleteTextView autoCompleteTxt;
        AutoCompleteTextView autoCompleteTxt2 ;
        AutoCompleteTextView autoCompleteTxt3 ;
        ArrayAdapter<String> adapterItems;
        ArrayAdapter<String> adapterItems2;
        ArrayAdapter<String> adapterItems3;
        autoCompleteTxt = findViewById(R.id.auto_complete_txt);
        autoCompleteTxt2 = findViewById(R.id.auto_complete_txt2);
        autoCompleteTxt3 = findViewById(R.id.auto_complete_txt3);
        adapterItems = new ArrayAdapter<String>(this,R.layout.list_item,items);
        adapterItems2 = new ArrayAdapter<String>(this,R.layout.list_item,items);
        adapterItems3 = new ArrayAdapter<String>(this,R.layout.list_item,buses);
        autoCompleteTxt.setAdapter(adapterItems);
        autoCompleteTxt2.setAdapter(adapterItems2);
        autoCompleteTxt3.setAdapter(adapterItems3);
        autoCompleteTxt.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
               // Toast.makeText(getApplicationContext(),"Item: "+item, Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTxt2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
              //  Toast.makeText(getApplicationContext(),"Item: "+item, Toast.LENGTH_SHORT).show();
            }
        });
        autoCompleteTxt3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                //  Toast.makeText(getApplicationContext(),"Item: "+item, Toast.LENGTH_SHORT).show();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
if(autoCompleteTxt.getText().toString().trim().equals("")||autoCompleteTxt2.getText().toString().trim().equals("")){
    Toast.makeText(MainActivity2.this, "Please Select The Locations", Toast.LENGTH_LONG).show();
}else{
    Intent intent = new Intent(MainActivity2.this,MainActivity3.class);
    startActivity(intent);
}
            }
        });
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity2.this,MainActivity4.class);
                startActivity(intent);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(autoCompleteTxt3.getText().toString().trim().equals("")){
                    Toast.makeText(MainActivity2.this, "Please Select The Bus Name", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(MainActivity2.this,MainActivity5.class);
                    String name =  autoCompleteTxt3.getText().toString().trim();
                    String route = "Technical - Tolar Bag - Mirpur 1 - Mirpur 2 - Mirpur 10 - Mirpur 11 - Mirpur 12 - Mati Kata - ECB - Bishsho Road - Jamuna Future Park ";
                    //  Toast.makeText(MainActivity2.this, name, Toast.LENGTH_SHORT).show();
                    intent.putExtra("name",name);
                    intent.putExtra("route",route);
                    startActivity(intent);
                }

            }
        });

    }

}