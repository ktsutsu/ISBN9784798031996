package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view) {
    	final Activity activity = this;
    	EditText text1 = (EditText)this.findViewById(R.id.editText1);
    	Editable str = text1.getText();
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setTitle("Message");
    	builder.setMessage("you typed: " + str);
    	builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				Toast toast = Toast.makeText(activity, "OK!", Toast.LENGTH_SHORT);
				toast.show();
			}
		});
    	builder.setNeutralButton("...", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				Toast toast = Toast.makeText(activity, "...?", Toast.LENGTH_SHORT);
				toast.show();
			}
		});
    	builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				Toast toast = Toast.makeText(activity, "Canceled...", Toast.LENGTH_SHORT);
				toast.show();
			}
		});
    	builder.show();
    }
}
