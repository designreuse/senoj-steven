package com.google.analytics.tracking.android;

import android.app.IntentService;
import android.content.Context;
import android.content.Intent;
import java.io.IOException;
import java.io.OutputStream;

public class CampaignTrackingService extends IntentService {
    public CampaignTrackingService() {
        super("CampaignIntentService");
    }

    public void m2376a(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("referrer");
        try {
            OutputStream openFileOutput = context.openFileOutput("gaInstallData", 0);
            openFileOutput.write(stringExtra.getBytes());
            openFileOutput.close();
        } catch (IOException e) {
            C0296b.m2380a("Error storing install campaign.");
        }
    }

    public void onHandleIntent(Intent intent) {
        m2376a(this, intent);
    }
}
