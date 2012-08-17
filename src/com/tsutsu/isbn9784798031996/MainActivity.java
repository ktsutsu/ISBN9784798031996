package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.TimePicker;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view) {
    	DatePicker picker1 = (DatePicker)this.findViewById(R.id.datePicker1);
    	TimePicker picker2 = (TimePicker)this.findViewById(R.id.timePicker1);
    	String date = String.format("%1$04d-%2$02d-%3$02d", picker1.getYear(), (picker1.getMonth() + 1), picker1.getDayOfMonth());
    	String time = String.format("%1$02d:%2$02d", picker2.getCurrentHour(), picker2.getCurrentMinute());
    	Toast toast = Toast.makeText(this, date + "\n" + time, Toast.LENGTH_SHORT);
    	toast.show();
    }
}
