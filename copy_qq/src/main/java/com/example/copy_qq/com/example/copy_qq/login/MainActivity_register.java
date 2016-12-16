package com.example.copy_qq.com.example.copy_qq.login;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.copy_qq.R;

public class MainActivity_register extends Activity {
    EditText edt ;
    private Button btn_next;
    private String etString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_register);
        edt = (EditText) findViewById(R.id.editText_register);
        btn_next = (Button) findViewById(R.id.button_registe_next);
        btn_next.setBackgroundResource(R.drawable.btn_null);
//文本输入的监听事件
        edt.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }
            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                    btn_next.setBackgroundResource(R.drawable.btn_normal);
            }
            @Override
            public void afterTextChanged(Editable editable) {
                etString = edt.getText().toString();
                if(etString.equals("")){
                    btn_next.setBackgroundResource(R.drawable.btn_null);
                }
            }
        });
//按钮的点击事件
        btn_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                etString = edt.getText().toString().trim();
                if(etString.equals("")){
                    btn_next.setBackgroundResource(R.drawable.btn_null);
                }else{
//                    发送信息给服务端
//                   btn_next.setBackgroundResource(R.drawable.btn_normal);
//                    Intent intent = new Intent();
//                    intent.setAction(Intent.ACTION_SENDTO);
//                    intent.setData(Uri.parse("smsto:"+etString));
//                    intent.putExtra(etString,"请求获取验证码");
//                    startActivity(intent);
                    Intent intent_1 = new Intent(MainActivity_register.this,MainActivity_register2.class);
                    startActivity(intent_1);

                }

            }
        });


    }
}
