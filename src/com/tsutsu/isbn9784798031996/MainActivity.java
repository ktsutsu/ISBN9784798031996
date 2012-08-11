package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.app.Activity;
import android.view.*;
import android.view.Menu;
import android.view.View;
import android.widget.*;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button)this.findViewById(R.id.button1);
        btn.setOnClickListener(
        	new View.OnClickListener() {
				public void onClick(View v) {
					TextView text1 = (TextView)findViewById(R.id.textView1);
					text1.setText("OK!");
				}
			}
        );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
