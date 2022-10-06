package com.xwrl.custom.dyztextbar;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author : Bilibili喜闻人籁
 * @since : 2022/10/6
 * 作用:
 */
public class TextBar extends View {
    private static final String TAG = "TextBar";

    public TextBar(Context context) {
        super(context);
    }

    public TextBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TextBar(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public void setWidth(int x){
        Log.d(TAG, "setWidth: "+x);
    }

    public void setHeight(int h){
        Log.d(TAG, "setHeight: "+h);
    }
}
