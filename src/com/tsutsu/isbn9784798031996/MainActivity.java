package com.tsutsu.isbn9784798031996;

import java.util.*;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.app.Activity;

public class MainActivity extends Activity {
	private int counter = 0;
	private ArrayAdapter<String> arrayadapter = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<String> arr = new ArrayList<String>();
        arr.add("First item");
        arrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arr);
        final ListView list = (ListView)this.findViewById(R.id.listView1);
        list.setAdapter(arrayadapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
					long arg3) {
				arrayadapter.add("No," + ++counter);
			}
		});
        list.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

			public boolean onItemLongClick(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				TextView text = (TextView)arg1;
				arrayadapter.remove((String)text.getText());
				return true;
			}
		});
    }
}
