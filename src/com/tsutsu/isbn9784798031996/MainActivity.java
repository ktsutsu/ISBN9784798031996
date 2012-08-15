package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.app.Activity;
import android.text.InputType;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction1(View view) {
    	EditText text1 = (EditText)this.findViewById(R.id.editText1);
    	text1.setInputType(InputType.TYPE_CLASS_NUMBER);
    }

    public void doAction2(View view) {
    	EditText text1 = (EditText)this.findViewById(R.id.editText1);
    	text1.setTransformationMethod(PasswordTransformationMethod.getInstance());
    }
}
