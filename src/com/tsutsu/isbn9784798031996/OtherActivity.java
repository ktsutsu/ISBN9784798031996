package com.tsutsu.isbn9784798031996;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OtherActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.other);
	}

	public void doAction(View view) {
		Intent intent = new Intent(this, com.tsutsu.isbn9784798031996.MainActivity.class);
		this.startActivity(intent);
	}
}
