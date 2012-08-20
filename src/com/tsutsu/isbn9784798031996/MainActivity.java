package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableRow;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void doAction(View view) {
    	TableRow row1 = (TableRow)this.findViewById(R.id.tableRow1);
    	Button btn = (Button)row1.getChildAt(1);
    	btn.setWidth(btn.getWidth() + 25);
	}
}
