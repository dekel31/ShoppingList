package com.shoppinglist;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by dekel31 on 12/3/2016.
 */

public class ItemView extends View {
    private String text;

    public ItemView(Context context) {
        super(context);
    }

    public ItemView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public void setText(String text) {
        //TODO put in textview
        this.text = text;
    }
}
