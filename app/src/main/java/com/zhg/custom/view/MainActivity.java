package com.zhg.custom.view;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import com.zhg.custom.view.activity.TestCheckedTextViewActivity;
import com.zhg.custom.view.activity.TestLoopImageViewActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }

    @OnClick(R.id.id_test_loop_image_view)
    public void goTestLoopImageView() {
        Intent intent = new Intent(this, TestLoopImageViewActivity.class);
        startActivity(intent);
    }
    @OnClick(R.id.id_test_checked_text_view)
    public void goTestCheckedViewActivity(){
        Intent intent=new Intent(this, TestCheckedTextViewActivity.class);
        startActivity(intent);
    }
}
