package cn.zhangxianli.foreground;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyServcieReceiver extends BroadcastReceiver {
    public MyServcieReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {
        MyIntentService.startActionBaz(context, "", "");
    }
}
