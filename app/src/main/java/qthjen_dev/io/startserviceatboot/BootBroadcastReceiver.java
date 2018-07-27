package qthjen_dev.io.startserviceatboot;

import android.content.Context;
import android.content.Intent;
import android.support.v4.content.WakefulBroadcastReceiver;

public class BootBroadcastReceiver extends WakefulBroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        //Launch the specified service when this message is received
        Intent startService = new Intent(context, MyTestService.class);
        startWakefulService(context, startService);
    }
}
