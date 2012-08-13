package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view) {
    	ProgressBar bar2 = (ProgressBar)this.findViewById(R.id.progressBar2);
    	int val = bar2.getProgress();
    	if (val == bar2.getMax()) {
    		bar2.setIndeterminate(true);
    	}
    	if (val == 0) {
    		bar2.setIndeterminate(false);
    	}
    	bar2.setProgress(++val);
    	TextView text1 = (TextView)this.findViewById(R.id.textView1);
    	text1.setText("value: " + bar2.getProgress());
    }
}
