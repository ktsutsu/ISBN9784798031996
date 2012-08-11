package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Activity activity = this;
        CheckBox check1 = (CheckBox)this.findViewById(R.id.checkBox1);
        check1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(CompoundButton buttonView,
					boolean isChecked) {
				Toast toast = Toast.makeText(activity, "You checked: " + isChecked, Toast.LENGTH_SHORT);
				toast.show();
			}
        });
    }
}
