package com.tsutsu.isbn9784798031996;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class OtherActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
		Intent intent = this.getIntent();
		if (intent.getAction().equals(Intent.ACTION_SEND)) {
			MyData data = (MyData)intent.getSerializableExtra("MyData");
			TextView text1 = (TextView)this.findViewById(R.id.otherTextView1);
			text1.setText(data.toString());
		}
	}
}
