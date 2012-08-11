package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity {

	private TextView text1;
	private EditText edit1;
	private Button btn1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final Activity activity = this;
        // ListView�쐬
        LinearLayout layout = new LinearLayout(this);
        layout.setOrientation(LinearLayout.VERTICAL);
        this.setContentView(layout);
        // TextView�쐬
        text1 = new TextView(this);
        text1.setText("dinamic widget!");
        text1.setTextSize(30);
        layout.addView(text1);
        // EditText�쐬
        edit1 = new EditText(this);
        edit1.setTextSize(30);
        layout.addView(edit1);
        // Button�쐬
        btn1 = new Button(this);
        btn1.setText("Click");
        layout.addView(btn1);
        // Button�̃C�x���g�ݒ�
        btn1.setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Toast toast = Toast.makeText(activity, "You typed: " + edit1.getText(), Toast.LENGTH_SHORT);
				toast.show();
			}
		});
    }

//    public void doAction(View view) {
//    	EditText edit1 = (EditText)this.findViewById(R.id.editText1);
//    	Editable str = edit1.getText();
//    	Toast toast = Toast.makeText(this, "You typed: " + str, Toast.LENGTH_SHORT);
//    	toast.show();
//    }
}
