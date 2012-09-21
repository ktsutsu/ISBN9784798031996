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
    	EditText edit2 = (EditText)this.findViewById(R.id.editText2);
    	EditText edit3 = (EditText)this.findViewById(R.id.editText3);
    	Editable name1 = edit1.getText();
    	Editable name2 = edit2.getText();
    	Editable age = edit3.getText();
    	MyData data = new MyData(name1.toString(), name2.toString(), age.toString());
    	Intent intent = new Intent(Intent.ACTION_SEND);
    	intent.setType("application/mydata");
    	intent.putExtra("MyData", data);
    	this.startActivity(intent);
    }
}
