package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Activity activity = this;
        Spinner spinner = (Spinner)this.findViewById(R.id.spinner1);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener() {

			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				Spinner spinner = (Spinner)arg0;
				String str = (String)spinner.getSelectedItem();
				Toast toast = Toast.makeText(activity, "you selected: " + str, Toast.LENGTH_SHORT);
				toast.show();
			}

			public void onNothingSelected(AdapterView<?> arg0) {
				Toast toast = Toast.makeText(activity, "NOT selected...", Toast.LENGTH_SHORT);
				toast.show();
			}
		});
    }
}
