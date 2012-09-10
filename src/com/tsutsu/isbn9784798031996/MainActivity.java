package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.app.*;
import android.widget.*;
import android.content.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view) {
    	EditText edit1 = (EditText)this.findViewById(R.id.editText1);
    	Editable str = edit1.getText();
    	Intent intent = new Intent(Intent.ACTION_SEND);
    	intent.setType("text/plain");
    	intent.putExtra(Intent.EXTRA_TEXT, str);
    	this.startActivity(intent);
    }
}
