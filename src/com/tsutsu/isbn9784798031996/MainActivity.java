package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.view.View;
import android.app.Activity;
import android.app.ProgressDialog;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view) {
    	final ProgressDialog dlog = new ProgressDialog(this);
    	dlog.setTitle("Progress...");
    	dlog.setMessage("please wait...");
    	dlog.setMax(100);
    	dlog.setProgressStyle(ProgressDialog.STYLE_HORIZONTAL);
    	dlog.show();
    	dlog.incrementProgressBy(50);
    }
}
