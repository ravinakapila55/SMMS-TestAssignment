package com.smms_testassignment.fonts;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.widget.EditText;

public class CustomEditTextRegular extends EditText
{

    public CustomEditTextRegular(Context context, AttributeSet attrs, int defStyle)
    {
        super(context, attrs, defStyle);
        init();
    }

    public CustomEditTextRegular(Context context, AttributeSet attrs)
    {
        super(context, attrs);
        init();
    }

    public CustomEditTextRegular(Context context)
    {
        super(context);
        init();
    }

    public void init()
    {
        if (!isInEditMode())
        {
       	Typeface normalTypeface = Typeface.createFromAsset(getContext().getAssets(), "OpenSans-Regular.ttf");
        setTypeface(normalTypeface);
        }
    }
}