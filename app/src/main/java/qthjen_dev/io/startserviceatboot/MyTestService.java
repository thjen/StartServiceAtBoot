package qthjen_dev.io.startserviceatboot;

import android.app.IntentService;
import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v4.content.WakefulBroadcastReceiver;

/**
 * Created by qthjen-dev on 7/27/18.
 */

public class MyTestService extends IntentService {

    public MyTestService() {
        super("BootSerivce");
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
