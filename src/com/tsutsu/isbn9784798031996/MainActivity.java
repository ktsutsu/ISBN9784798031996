package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Activity activity = this;
        RadioGroup group1 = (RadioGroup)this.findViewById(R.id.radioGroup1);
        group1.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				RadioButton btn = (RadioButton)findViewById(checkedId);
				Toast toast = Toast.makeText(activity, "You checked: " + btn.getText(), Toast.LENGTH_SHORT);
				toast.show();
			}
		});
    }
}
