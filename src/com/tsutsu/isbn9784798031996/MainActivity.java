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
    	final Activity activity = this;
    	EditText edit1 = (EditText)this.findViewById(R.id.editText1);
    	Editable str = edit1.getText();
    	TextView text1 = (TextView)this.findViewById(R.id.textView1);
    	text1.setText("you typed: " + str);
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	builder.setTitle("Message");
    	builder.setMessage("change activity.");
    	builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
			
			public void onClick(DialogInterface dialog, int which) {
				Intent intent = new Intent(activity, com.tsutsu.isbn9784798031996.OtherActivity.class);
				activity.startActivity(intent);
			}
		});
    	builder.setNegativeButton("Cancel", null);
    	builder.show();
    }
}
