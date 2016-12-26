package com.example.copy_qq.com.example.copy_qq.fragment;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.copy_qq.R;
import com.example.copy_qq.com.example.copy_qq.login.CicrleDrawable;

public class Fragment_people extends Fragment {
ImageView iv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // TODO Auto-generated method stub
//		获得主布局
        View v = inflater.inflate(R.layout.fragment_people, container, false);
        //        imageview的圆形drawable
        iv = (ImageView) v.findViewById(R.id.imageview_fragment_pe);
        Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.login);
        iv.setImageDrawable(new CicrleDrawable(bitmap));
        return v;
    }

}
