package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.Toast;
import android.app.Activity;
import android.app.DatePickerDialog;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view) {
    	final Activity activity = this;
    	DatePickerDialog dlog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
			
			public void onDateSet(DatePicker view, int year, int monthOfYear,
					int dayOfMonth) {
				String msg = String.format("%1$04d-%2$02d-%3$02d", year, (monthOfYear + 1), dayOfMonth);
				Toast toast = Toast.makeText(activity, msg, Toast.LENGTH_SHORT);
				toast.show();
			}
		}, 2012, 0, 1);
    	dlog.show();
    }
}
