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
    	final boolean[] item_checked = {false, false, false};
    	builder.setMultiChoiceItems(items, item_checked, new DialogInterface.OnMultiChoiceClickListener() {
			
			public void onClick(DialogInterface dialog, int which, boolean isChecked) {
				item_checked[which] = isChecked;
				if (isChecked) {
					Toast toast = Toast.makeText(activity, "you checked: " + which, Toast.LENGTH_SHORT);
					toast.show();
				}
			}
		});
    	builder.setNeutralButton("OK!", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				String msg = "*selected item*";
				boolean is_checked = false;
				for (int i = 0; i < items.length; i++) {
					if (item_checked[i] == true) {
						is_checked = true;
						msg += "\n" + items[i];
					}
				}
				if (!is_checked) {
					msg = "no items selected...";
				}
				Toast toast = Toast.makeText(activity, msg, Toast.LENGTH_SHORT);
				toast.show();
			}
		});
    	builder.show();
    }
}
