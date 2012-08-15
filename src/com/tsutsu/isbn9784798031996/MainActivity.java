package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.app.Activity;
import android.text.Editable;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view) {
    	EditText edit1 = (EditText)this.findViewById(R.id.editText1);
    	Editable str = edit1.getText();
    	TextView text1 = (TextView)this.findViewById(R.id.textView1);
    	text1.setText("you typed: " + str);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
    	TextView text1 = (TextView)this.findViewById(R.id.textView1);
    	outState.putString("text1", (String)text1.getText());
    	super.onSaveInstanceState(outState);
    }

	@Override
	protected void onRestoreInstanceState(Bundle savedInstanceState) {
    	TextView text1 = (TextView)this.findViewById(R.id.textView1);
    	text1.setText(savedInstanceState.getString("text1"));
		super.onRestoreInstanceState(savedInstanceState);
	}
}
