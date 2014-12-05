package com.phunware.foregroundapplication;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import java.util.List;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        final List<ActivityManager.RunningAppProcessInfo> processes = activityManager.getRunningAppProcesses();

        ActivityManager.RunningAppProcessInfo currentProcessInfo = null;

        final String packageName = context.getPackageName();

        for (ActivityManager.RunningAppProcessInfo info : processes) {
            Log.d("JAY", "processName: " + info.processName);
            if (packageName.equalsIgnoreCase(info.processName))
            currentProcessInfo = info;
            break;
        }

        if (currentProcessInfo == null) {
            Log.d("JAY", "currentProcessInfo is null");
        } else {
            Log.d("JAY", "importance: " + currentProcessInfo.importance);
        }
    }
}
