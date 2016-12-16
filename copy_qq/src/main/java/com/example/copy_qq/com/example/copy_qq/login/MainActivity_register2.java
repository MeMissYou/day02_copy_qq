package com.example.copy_qq.com.example.copy_qq.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.copy_qq.R;

public class MainActivity_register2 extends AppCompatActivity {
private Button btn_send_sms;
    private EditText edt_send;
    private  Button btn_send_finish;
    private String edtString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_register2);
        btn_send_finish = (Button) findViewById(R.id.button_registe2_finish);
        btn_send_sms = (Button) findViewById(R.id.send_sms);
        edt_send = (EditText) findViewById(R.id.edt_register2);
//
        edt_send.addTextChangedListener(new TextWatcher() {
    @Override
    public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

    }

    @Override
    public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
         btn_send_finish.setBackgroundResource(R.drawable.btn_normal);
        btn_send_sms.setBackgroundResource(R.drawable.btn_null);
    }
//
    @Override
    public void afterTextChanged(Editable editable) {
        edtString = edt_send.getText().toString().trim();
        if(edtString.equals("")){
            btn_send_finish.setBackgroundResource(R.drawable.btn_null);
            btn_send_sms.setBackgroundResource(R.drawable.btn_normal);
        }

    }
});
        //发送按钮的点击事件
        btn_send_sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtString = edt_send.getText().toString().trim();
                if(edtString.equals("")){
                    btn_send_sms.setBackgroundResource(R.drawable.btn_null);

                }else{
                    btn_send_sms.setBackgroundResource(R.drawable.btn_normal);
                    Toast.makeText(MainActivity_register2.this,"发送了",Toast.LENGTH_LONG).show();
                }
            }
        });
        btn_send_finish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtString = edt_send.getText().toString().trim();
                if (edtString.equals("")){
                    btn_send_finish.setBackgroundResource(R.drawable.btn_null);
                 }else{
                    Toast.makeText(MainActivity_register2.this,"进入qq主页",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
