package com.zhg.custom;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zhg.custom.view.LoopImageView;

public class MainActivity extends AppCompatActivity {

    LoopImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mImageView = (LoopImageView) findViewById(R.id.id_view);
//        mImageView.setBitmap(BitmapFactory.decodeResource(getResources(),R.mipmap.android_m_hero_1200));
//        mImageView.setMoveSpeed(10);
    }


    @Override
    protected void onResume() {
        super.onResume();
        mImageView.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
        mImageView.onPause();

    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }
}
