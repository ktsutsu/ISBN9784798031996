package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TabHost;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.app.TabActivity;

public class MainActivity extends TabActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Activity activity = this;
        final TabHost tabhost = this.getTabHost();
        TabHost.TabSpec spec1 = tabhost.newTabSpec("Tab1");
        spec1.setIndicator("Tab1");
        spec1.setContent(R.id.tab1);
        tabhost.addTab(spec1);
        TabHost.TabSpec spec2 = tabhost.newTabSpec("Tab2");
        spec2.setIndicator("Tab2");
        spec2.setContent(R.id.tab2);
        tabhost.addTab(spec2);
        TabHost.TabSpec spec3 = tabhost.newTabSpec("Tab3");
        spec3.setIndicator("Tab3");
        spec3.setContent(R.id.tab3);
        tabhost.addTab(spec3);
        tabhost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
			
			public void onTabChanged(String tabId) {
				LinearLayout layout = (LinearLayout)tabhost.getCurrentView();
				TextView text = (TextView)layout.getChildAt(0);
				Toast toast = Toast.makeText(activity, "open tab: " + tabId + "\n" + text.getText(), Toast.LENGTH_SHORT);
				toast.show();
			}
		});
    }
}
