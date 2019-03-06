package com.vinmacro.toasterlib;

import android.content.Context;
import android.widget.Toast;

public class Toaster {

    public static  void message(Context c,String msg){

        Toast.makeText(c,msg,Toast.LENGTH_SHORT).show();
    }
}
