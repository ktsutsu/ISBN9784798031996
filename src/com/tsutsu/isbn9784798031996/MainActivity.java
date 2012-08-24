package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.widget.SlidingDrawer;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Activity activity = this;
        SlidingDrawer drawer = (SlidingDrawer)this.findViewById(R.id.slidingDrawer1);
        drawer.setOnDrawerOpenListener(new SlidingDrawer.OnDrawerOpenListener() {
			
			public void onDrawerOpened() {
				Toast toast = Toast.makeText(activity, "open drawer!", Toast.LENGTH_SHORT);
				toast.show();
			}
		});
        drawer.setOnDrawerCloseListener(new SlidingDrawer.OnDrawerCloseListener() {
			
			public void onDrawerClosed() {
				Toast toast = Toast.makeText(activity, "close drawer...", Toast.LENGTH_SHORT);
				toast.show();
			}
		});
    }
}
