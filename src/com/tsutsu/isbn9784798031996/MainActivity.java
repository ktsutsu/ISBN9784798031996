package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.app.Activity;
import android.app.AlertDialog;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view) {
    	EditText text1 = (EditText)this.findViewById(R.id.editText1);
    	Editable str = text1.getText();
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setMessage("you typed: " + str);
    	builder.show();
    }
}
