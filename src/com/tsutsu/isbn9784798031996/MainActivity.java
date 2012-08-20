package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Activity activity = this;
        String[] items = {"One", "Two", "Three", "Four", "Five", "Six", "Seven"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item, items);
        GridView view1 = (GridView)this.findViewById(R.id.gridView1);
        view1.setAdapter(adapter);
        view1.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				Toast toast = Toast.makeText(activity, "you clicked: " + arg2, Toast.LENGTH_SHORT);
				toast.show();
			}
		});
    }
}
