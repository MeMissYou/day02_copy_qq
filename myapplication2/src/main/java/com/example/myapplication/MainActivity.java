package com.example.myapplication;


import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public Button btn1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = (Button) findViewById(R.id.button);
    }
        public  void btn(View v){
        Toast toast = new Toast(MainActivity.this);
        toast.setGravity(Gravity.CENTER,0,0);
        ImageView image = new ImageView(MainActivity.this);
        image.setImageResource(R.mipmap.ic_launcher);
        LinearLayout lin = new LinearLayout(MainActivity.this);
        lin.addView(image);
        TextView textview = new TextView(MainActivity.this);
        textview.setText("请输入账号");
        textview.setTextColor(Color.GRAY);
        lin.addView(textview);
        toast.setView(lin);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.show();
        }

    }




