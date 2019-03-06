package com.vinmacro.toasterlib;

import android.content.Context;
import android.widget.Toast;

public class Toaster {


    public static void msg(Context c, String msg, boolean isLongDuration, boolean isHavetoShow) {

        if (isHavetoShow) {

            if (isLongDuration)
                Toast.makeText(c, msg, Toast.LENGTH_LONG).show();
            else
                Toast.makeText(c, msg, Toast.LENGTH_SHORT).show();
        }
    }
}
