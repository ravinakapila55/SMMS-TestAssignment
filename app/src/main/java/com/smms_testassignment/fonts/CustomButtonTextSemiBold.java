package com.smms_testassignment.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.Button;


public class CustomButtonTextSemiBold extends Button {

    public CustomButtonTextSemiBold(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init();
    }

    public CustomButtonTextSemiBold(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CustomButtonTextSemiBold(Context context) {
        super(context);
        init();
    }

    public void init() {
        if (!isInEditMode()){
       	Typeface normalTypeface = Typeface.createFromAsset(getContext().getAssets(), "OpenSans-Bold.ttf");
        	setTypeface(normalTypeface);
        }
    }
}