package com.example.copy_qq.com.example.copy_qq.login;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.copy_qq.R;
public class MainAcivity_login extends Activity {
private ImageView iv;
    public Button btn_login;
    public  Button btn_no_login;
    public  Button btn_register;
    public  EditText ed_name;
    public  EditText ed_pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_acivity_login);
//        imageview的圆形drawable
        ImageView iv = (ImageView) findViewById(R.id.imageView_login);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.qq);
        iv.setImageDrawable(new CicrleDrawable(bitmap));
//        输入框
        ed_name = (EditText) findViewById(R.id.name);
        ed_pwd = (EditText) findViewById(R.id.pwd);

//        按钮的点击逻辑
        btn_login = (Button) findViewById(R.id.button_login);
        btn_no_login= (Button) findViewById(R.id.button_no_login);
        btn_register= (Button) findViewById(R.id.button_user_login);
//登录按钮
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String number = ed_name.getText().toString().trim();
                String pwd = ed_pwd.getText().toString().trim();
                if (TextUtils.isEmpty(number) || TextUtils.isEmpty(pwd)) {
//                    自定义toast 加载布局
                    View v = LayoutInflater.from(MainAcivity_login.this).inflate(R.layout.activity_toast,null);
                    Toast toast = new Toast(MainAcivity_login.this);
                    toast.setView(v);
                    toast.setGravity(Gravity.TOP,0,0);
                    toast.setDuration(Toast.LENGTH_SHORT);
                    toast.show();
                } else {
                    Toast.makeText(MainAcivity_login.this,"进入qq主页"+number,Toast.LENGTH_LONG).show();
                }
            }
        });
//注册按钮
        btn_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent intent = new Intent(MainAcivity_login.this,MainActivity_register.class);
                startActivity(intent);
            }

        });

    }



}
