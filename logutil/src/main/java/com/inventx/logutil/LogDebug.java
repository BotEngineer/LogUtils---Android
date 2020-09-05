package com.inventx.logutil;

import android.util.Log;

/**
 * Created by Abhilash MB on 05-09-2020.
 */
public class LogDebug {

    private static final String TAG = "DEBUG APP";

    public static void d(String message){
        Log.d(TAG, message);
    }
}
