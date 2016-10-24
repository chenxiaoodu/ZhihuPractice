package com.example.zhihupractice.utility;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

/**
 * Created by DADOU on 2016/10/21.
 */
public class Utility {
    public static boolean checkNetworkConnection(Context context){
        ConnectivityManager cm = (ConnectivityManager)context.getSystemService(Context.CONNECTIVITY_SERVICE);
        NetworkInfo activityNetwork = cm.getActiveNetworkInfo();
        return activityNetwork != null&&activityNetwork.isConnected();


    }
    public static void noNetworkAlert(Context context){
        Toast.makeText(context,"No Network",Toast.LENGTH_SHORT).show();
    }
}
