package com.example.copy_qq.com.example.copy_qq.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.provider.Settings;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.Switch;
import android.widget.Toast;

import com.example.copy_qq.R;
import com.example.copy_qq.com.example.copy_qq.login.CicrleDrawable;

public class Fragment_message extends Fragment {
    ImageView iv;
    PopupWindow mpopupWindow;
    Button btn_popup;
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
        mpopupWindow = new PopupWindow(
                popupView, WindowManager.LayoutParams.MATCH_PARENT,
                WindowManager.LayoutParams.WRAP_CONTENT,true);
        //使其聚齐
        mpopupWindow.setTouchable(true);
        //设置允许在外点击消失
        mpopupWindow.setOutsideTouchable(true);

        btn_popup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             showPopupWindow();
            }
        });


        return v;
      }
    public  void showPopupWindow(){
        Button btn1 = (Button) getView().findViewById(R.id.message_pop1);
        Button btn2 = (Button) getView().findViewById(R.id.message_pop2);
        Button btn3 = (Button) getView().findViewById(R.id.message_pop3);
        Button btn4 = (Button) getView().findViewById(R.id.message_pop4);
        Button btn5 = (Button) getView().findViewById(R.id.message_pop5);
        mpopupWindow.showAsDropDown(btn_popup);
    }
    public void onClik (View view){
        int id = view.getId();
        switch (id){
            case R.id.message_pop1:{
                Toast.makeText(getContext(),"ha1 ",Toast.LENGTH_SHORT).show();
                mpopupWindow.dismiss();
            }
            break;
            case R.id.message_pop2:{
                Toast.makeText(getContext(),"ha2 ",Toast.LENGTH_SHORT).show();
                mpopupWindow.dismiss();
            }
            break;
            case R.id.message_pop3:{
                Toast.makeText(getContext(),"ha3 ",Toast.LENGTH_SHORT).show();
                mpopupWindow.dismiss();
            }
            break;
            case R.id.message_pop4:{
                Toast.makeText(getContext(),"ha4 ",Toast.LENGTH_SHORT).show();
                mpopupWindow.dismiss();
            }
            break;
            case R.id.message_pop5:{
                Toast.makeText(getContext(),"ha5 ",Toast.LENGTH_SHORT).show();
                mpopupWindow.dismiss();
            }
            break;
        }
    }

}
