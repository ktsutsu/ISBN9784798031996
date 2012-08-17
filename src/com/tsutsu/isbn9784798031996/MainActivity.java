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
    	DialogInterface.OnClickListener listener = new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				String msg = "";
				switch (which) {
				case DialogInterface.BUTTON_POSITIVE:
					msg = "OK!!!!";
					break;

				case DialogInterface.BUTTON_NEUTRAL:
					msg = "...?";
					break;

				case DialogInterface.BUTTON_NEGATIVE:
					msg = "canceled...";
					break;

				default:
					break;
				}
				Toast toast = Toast.makeText(activity, msg, Toast.LENGTH_SHORT);
				toast.show();
			}
		};
		builder.setPositiveButton("OK", listener);
		builder.setNeutralButton("...", listener);
		builder.setNegativeButton("Cancel", listener);
		builder.show();
    }
}
