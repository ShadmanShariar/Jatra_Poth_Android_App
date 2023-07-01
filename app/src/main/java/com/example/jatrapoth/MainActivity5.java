package com.example.jatrapoth;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;

public class MainActivity5 extends AppCompatActivity {
private TextView ed1 , ed2 ;
private  ImageView iv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        ed1 = (TextView) findViewById(R.id.busName);
        ed2 = (TextView) findViewById(R.id.busRoute);
        String a1 = getIntent().getStringExtra("name");
        String a2 = getIntent().getStringExtra("route");
        ed1.setText(a1);
        ed2.setText(a2);
        iv = (ImageView) findViewById(R.id.imageviewTest);

        if(a1.equals("Asim")){
            iv.setImageResource(R.drawable.asim);
        }
        if(a1.equals("Projapoti")){
            iv.setImageResource(R.drawable.projapoti);
        }
    }
}