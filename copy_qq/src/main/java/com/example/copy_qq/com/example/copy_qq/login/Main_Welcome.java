package com.example.copy_qq.com.example.copy_qq.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.os.Bundle;
import com.example.copy_qq.R;
public class Main_Welcome extends Activity {

    Handler handler = new Handler(){
        @Override
        public void dispatchMessage(Message msg) {
            super.dispatchMessage(msg);
            Intent intent1 = new Intent(Main_Welcome.this,MainAcivity_login.class);
            startActivity(intent1);
            finish();
        }
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main__welcome);
        handler.sendEmptyMessageDelayed(1,3000);
    }
}
