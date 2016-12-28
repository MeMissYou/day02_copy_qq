package com.example.copy_qq.com.example.copy_qq.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.Toast;

import com.example.copy_qq.R;
import com.example.copy_qq.com.example.copy_qq.login.CicrleDrawable;

public class Fragment_message extends Fragment {
    ImageView iv;
    PopupWindow mpopupWindow;
    Button btn_popup;
    Button btn_message,btn_tel;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
       Bundle savedInstanceState) {
        // TODO Auto-generated method stub
//		获得主布局
        View v = inflater.inflate(R.layout.fragment_message, container, false);
        //        imageview的圆形drawable
        iv = (ImageView) v.findViewById(R.id.login_message);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.login);
        iv.setImageDrawable(new CicrleDrawable(bitmap));

        //popupWindow
        btn_popup = (Button) v.findViewById(R.id.btn_message_add);
        //创建一个popupwindow对象
        final View popupView = LayoutInflater.from(getContext()).inflate(R.layout.popupwindow,null);
        mpopupWindow = new PopupWindow(popupView);
        mpopupWindow.setWidth(ViewGroup.LayoutParams.WRAP_CONTENT);
        mpopupWindow.setHeight(ViewGroup.LayoutParams.WRAP_CONTENT);
//                , WindowManager.LayoutParams.WRAP_CONTENT,
//                WindowManager.LayoutParams.WRAP_CONTENT,true
        //使其聚齐
        mpopupWindow.setTouchable(true);
        //设置允许在外点击消失
        mpopupWindow.setOutsideTouchable(true);

        btn_popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mpopupWindow.showAsDropDown(btn_popup, Gravity.BOTTOM,60,0);
            }
        });
        //top的消息和电话的点击按钮
        btn_message = (Button) v.findViewById(R.id.btn_message_1);
        btn_tel = (Button) v.findViewById(R.id.btn_message_2);
//        btn_message.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                btn_message.setClickable(true);
//                btn_tel.setClickable(false);
//                        }
//        });
//        btn_tel.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                btn_message.setClickable(false);
//                btn_tel.setClickable(true);
//            }
//        });

//        返回v
        return v;
      }
//    //子菜单的点击事件
//    public  void showPopupWindow(){
//        Button btn1 = (Button) getView().findViewById(R.id.message_pop1);
//        btn1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(),"点击了btn1",Toast.LENGTH_SHORT).show();
//            }
//        });
//        Button btn2 = (Button) getView().findViewById(R.id.message_pop2);
//        btn2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(),"点击了btn2",Toast.LENGTH_SHORT).show();
//            }
//        });
//        Button btn3 = (Button) getView().findViewById(R.id.message_pop3);
//        btn3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(),"点击了btn3",Toast.LENGTH_SHORT).show();
//            }
//        });
//        Button btn4 = (Button) getView().findViewById(R.id.message_pop4);
//        btn4.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(),"点击了btn4",Toast.LENGTH_SHORT).show();
//            }
//        });
//        Button btn5 = (Button) getView().findViewById(R.id.message_pop5);
//        btn5.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getContext(),"点击了btn5",Toast.LENGTH_SHORT).show();
//            }
//        });

//    }

}
