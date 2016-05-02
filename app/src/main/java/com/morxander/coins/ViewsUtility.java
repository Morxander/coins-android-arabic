package com.morxander.coins;

import android.content.Context;
import android.graphics.Typeface;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by morxander on 5/2/16.
 */
public class ViewsUtility {

    private static Typeface getTypeFace(Context context){
        Typeface face = Typeface.createFromAsset(context.getAssets(), "fonts/Ubuntu-BI.ttf");
        return face;
    }

    public static void changeTypeFace(Context context, EditText editText){
        Typeface face = getTypeFace(context);
        editText.setTypeface(face);
    }

    public static void changeTypeFace(Context context, TextView textView){
        Typeface face = getTypeFace(context);
        textView.setTypeface(face);
    }

}