package com.tsutsu.isbn9784798031996;

import android.provider.Settings;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.app.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity {
	static final int ACTIVITY_CODE = 0;
	static final int NOTIFY_ID = 0;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view) {
    	EditText edit1 = (EditText)this.findViewById(R.id.editText1);
    	Editable s = edit1.getText();
    	Intent intent = new Intent(this, com.tsutsu.isbn9784798031996.MainActivity.class);
    	PendingIntent pending = PendingIntent.getActivity(this, ACTIVITY_CODE, intent, PendingIntent.FLAG_CANCEL_CURRENT);
    	Notification notify = new Notification();
    	notify.flags = Notification.FLAG_AUTO_CANCEL;
    	notify.flags += Notification.FLAG_SHOW_LIGHTS;
    	notify.icon = R.drawable.ic_launcher;
    	notify.tickerText = "HelloApp notification!!";
    	notify.number = 5;
    	notify.ledARGB = 0xffffff00;
    	notify.ledOnMS = 300;
    	notify.ledOffMS = 700;
    	notify.vibrate = new long[]{200, 200, 800, 200, 800, 200};
    	notify.sound = Settings.System.DEFAULT_NOTIFICATION_URI;
    	notify.setLatestEventInfo(this, "HelloApp Info", "message: " + s, pending);
    	NotificationManager manager = (NotificationManager)this.getSystemService(Activity.NOTIFICATION_SERVICE);
    	manager.notify(NOTIFY_ID, notify);
    }
}
