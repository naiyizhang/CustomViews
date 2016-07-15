package com.zhg.custom.view.check;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by nyzhang on 2016/7/15.
 * 支持checked属性的textView，做练习用，正式使用请用官方的CheckedTextView
 */
public class MyCheckedTextView extends TextView {

    private static int[]ATTRS=new int[]{android.R.attr.state_checked};
    private boolean mChecked;//是否被选中
    public MyCheckedTextView(Context context) {
        this(context,null);
    }

    public MyCheckedTextView(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public MyCheckedTextView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        TypedArray a=null;
        try {
            a=context.obtainStyledAttributes(attrs,R.styleable.MyCheckedTextView,defStyleAttr,0);
            mChecked=a.getBoolean(R.styleable.MyCheckedTextView_android_checked,false);
        } finally {
            if(a!=null)a.recycle();
        }

    }

    public void setChecked(boolean isChecked){
        mChecked=isChecked;
        refreshDrawableState();
    }
    public boolean isChecked(){
        return mChecked;
    }
    public void toggleChecked(){
        setChecked(!mChecked);
    }

    @Override
    protected int[] onCreateDrawableState(int extraSpace) {
        int[]drawableState= super.onCreateDrawableState(extraSpace+1);
        if(isChecked()){
            mergeDrawableStates(drawableState,ATTRS);
        }
        return drawableState;
    }

}
