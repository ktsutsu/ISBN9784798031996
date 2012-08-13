package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.app.Activity;
import android.widget.*;
import android.widget.SeekBar.OnSeekBarChangeListener;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Activity activity = this;
        final TextView text1 = (TextView)this.findViewById(R.id.textView1);
        SeekBar bar1 = (SeekBar)this.findViewById(R.id.seekBar1);
        bar1.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
			public void onStopTrackingTouch(SeekBar seekBar) {
				Toast toast = Toast.makeText(activity, "Stop...", Toast.LENGTH_SHORT);
				toast.show();
			}
			
			public void onStartTrackingTouch(SeekBar seekBar) {
				Toast toast = Toast.makeText(activity, "Start!", Toast.LENGTH_SHORT);
				toast.show();
			}
			
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				text1.setText("value: " + progress);
			}
		});
    }
}
