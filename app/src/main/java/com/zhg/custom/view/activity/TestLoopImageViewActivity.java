package com.zhg.custom.view.activity;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.zhg.custom.view.LoopImageView;
import com.zhg.custom.view.R;

public class TestLoopImageViewActivity extends AppCompatActivity {
    LoopImageView mImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_loop_image_view);
        mImageView = (LoopImageView) findViewById(R.id.id_image_view);
//        mImageView.setBitmap(BitmapFactory.decodeResource(getResources(),R.mipmap.android_m_hero_1200));//设置图片资源
//        mImageView.setMoveSpeed(10);//设置每毫秒移动像素数

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==android.R.id.home){
            onBackPressed();
            return true;
        }

        return super.onOptionsItemSelected(item);
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
}
