package com.bnb.binh.kimtinnsng;

import android.content.Context;
import android.database.SQLException;
import android.os.CountDownTimer;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.bnb.binh.kimtinnsng.quanlydatabase.DBHelper;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private MyAdapter myAdapter;
    private ImageView imageView;
    private AppBarLayout appBarLayoutl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        begin();
        timer();
    }

    private void begin() {
        mViewPager = (ViewPager) findViewById(R.id.view_page);
        myAdapter = new MyAdapter(getSupportFragmentManager());
        mViewPager.setAdapter(myAdapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tab_lay_out);
        tabLayout.setupWithViewPager(mViewPager);
       imageView = (ImageView)findViewById(R.id.imga_trang_chu);
       appBarLayoutl = (AppBarLayout)findViewById(R.id.appbarid);


    }






    private void  timer(){
        appBarLayoutl.setBackgroundResource(R.mipmap.lienquan1);

        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                timer2();
            }
        }.start();


    }
    private void  timer2(){
        appBarLayoutl.setBackgroundResource(R.mipmap.lienquan2);

        new CountDownTimer(5000, 1000) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {
                timer();
            }
        }.start();


    }

}
