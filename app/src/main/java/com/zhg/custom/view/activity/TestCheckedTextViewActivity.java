package com.zhg.custom.view.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CheckedTextView;

import com.zhg.custom.view.R;
import com.zhg.custom.view.check.MyCheckedTextView;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestCheckedTextViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_checked_text_view);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.id_checked_text_view)
    public void onClick(CheckedTextView view) {
        view.setChecked(!view.isChecked());
    }

    @OnClick(R.id.id_my_checked_text_view)
    public void onClick(MyCheckedTextView view) {
        view.toggleChecked();
    }
}
