package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Activity activity = this;
        Button button = (Button)this.findViewById(R.id.button1);
        button.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				Toast toast = Toast.makeText(activity, "on Click!", Toast.LENGTH_SHORT);
				toast.show();
			}
		});
        button.setOnLongClickListener(new OnLongClickListener() {
			
			public boolean onLongClick(View v) {
				Toast toast = Toast.makeText(activity, "on Long Click...", Toast.LENGTH_SHORT);
				toast.show();
				return true;
			}
		});
    }
}
