package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view) {
    	final Activity activity = this;
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setTitle("Message");
    	final CharSequence[] items = {"Android", "iPhone", "Windows Phone"};
    	final int[] sel_item = {0};
    	builder.setSingleChoiceItems(items, 0, new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				sel_item[0] = which;
				Toast toast = Toast.makeText(activity, "you selected: " + which, Toast.LENGTH_SHORT);
				toast.show();
			}
		});
    	builder.setNeutralButton("OK!", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				String msg = "selected: " + items[sel_item[0]];
				Toast toast = Toast.makeText(activity, msg, Toast.LENGTH_SHORT);
				toast.show();
			}
		});
    	builder.show();
    }
}
