package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.view.View;
import android.widget.TimePicker;
import android.widget.Toast;
import android.app.Activity;
import android.app.TimePickerDialog;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view) {
    	final Activity activity = this;
    	TimePickerDialog dlog = new TimePickerDialog(this, new TimePickerDialog.OnTimeSetListener() {
			
			public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
				String msg = String.format("%1$02d:%2$02d", hourOfDay, minute);
				Toast toast = Toast.makeText(activity, msg, Toast.LENGTH_SHORT);
				toast.show();
			}
		}, 0, 0, true);
    	dlog.show();
    }
}
