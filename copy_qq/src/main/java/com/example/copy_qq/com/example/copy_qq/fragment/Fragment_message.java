package com.example.copy_qq.com.example.copy_qq.fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.copy_qq.R;

public class Fragment_message extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
       Bundle savedInstanceState) {
        // TODO Auto-generated method stub
//		获得主布局
        View v = inflater.inflate(R.layout.fragment_message, container, false);
        return v;
      }
    }
