 package com.example.copy_qq;
                import android.graphics.Bitmap;
                import android.graphics.BitmapFactory;
                import android.graphics.Color;
                import android.media.Image;
                import android.os.Build;
                import android.os.Bundle;
                import android.support.v4.app.FragmentActivity;
                import android.support.v4.app.FragmentTabHost;
                import android.view.LayoutInflater;
                import android.view.View;
                import android.view.Window;
                import android.view.WindowManager;
                import android.widget.ImageView;
                import android.widget.TabHost;
                import android.widget.TextView;

                import com.example.copy_qq.com.example.copy_qq.SlideMenu;
                import com.example.copy_qq.com.example.copy_qq.fragment.Fragment_dynamic;
                import com.example.copy_qq.com.example.copy_qq.fragment.Fragment_message;
                import com.example.copy_qq.com.example.copy_qq.fragment.Fragment_people;
                import com.example.copy_qq.com.example.copy_qq.login.CicrleDrawable;

 public class MainActivity extends FragmentActivity {
     /**
      * FragmentTabhost
      */
     private FragmentTabHost mTabHost;

     /**
      * 布局填充器
      *
      */
     private LayoutInflater mLayoutInflater;

     /**
      * Fragment数组界面
      *
      */
     private Class mFragmentArray[] = {Fragment_message.class,
             Fragment_people.class, Fragment_dynamic.class,
     };
     /**
      * 存放图片数组
      *
      */
     private int mImageArray[] = { R.drawable.tab_message, R.drawable.tab_people,R.drawable.tab_dynamic,
     };

     /**
      * 选修卡文字
      *
      */
     private String mTextArray[] = { "消息", "联系人", "动态" };
     /**
      *
      *
      */

     public void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_main);
//         沉浸式状态栏
         if (Build.VERSION.SDK_INT>= Build.VERSION_CODES.KITKAT){
//             透明通知栏
             getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
//             透明导航栏
             getWindow().addFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION);
//             调用分封类，设置颜色
             StatusBarCompat.compat(this,Color.BLUE);
         }
//        imageview的圆形drawable
         ImageView iv = (ImageView) findViewById(R.id.img_menu_login);
         Bitmap bitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.login);
         iv.setImageDrawable(new CicrleDrawable(bitmap));
         initView();

     }

     private void initView() {
         mLayoutInflater = LayoutInflater.from(this);

         // 找到TabHost
         mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
         mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
         // 得到fragment的个数
         int count = mFragmentArray.length;
         for (int i = 0; i < count; i++) {
             // 给每个Tab按钮设置图标、文字和内容。
             TabHost.TabSpec tabSpec = mTabHost.newTabSpec(mTextArray[i])
                     .setIndicator(getTabItemView(i));
             // 将Tab按钮添加进Tab选项卡中
             mTabHost.addTab(tabSpec, mFragmentArray[i], null);
             // 设置Tab按钮的背景
             mTabHost.getTabWidget().getChildAt(i)
                     .setBackgroundResource(R.drawable.tabhost);

         }
     }
     private View getTabItemView(int index) {
         // TODO Auto-generated method stub
         View view = mLayoutInflater.inflate(R.layout.tab_item_view, null);
         ImageView imageView = (ImageView) view.findViewById(R.id.imageview);
         imageView.setImageResource(mImageArray[index]);
         TextView textView = (TextView) view.findViewById(R.id.textview);
         textView.setText(mTextArray[index]);
         return view;

     }

 }
