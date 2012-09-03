package com.tsutsu.isbn9784798031996;

import java.util.*;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.app.ListActivity;

public class MainActivity extends ListActivity {
	private ArrayAdapter<String> arrayadapter = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final ListActivity activity = this;
        ListView list = this.getListView();
        list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        List<String> arr = new ArrayList<String>();
        arr.add("First item");
        arr.add("Second item");
        arr.add("Third item");
        arrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, arr);
        this.setListAdapter(arrayadapter);
        list.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {

			public void onItemSelected(AdapterView<?> arg0, View arg1,
					int arg2, long arg3) {
				TextView text = (TextView)arg1;
				Toast toast = Toast.makeText(activity, "you selected: " + arg2 + ": " + text.getText(), Toast.LENGTH_SHORT);
				toast.show();
			}

			public void onNothingSelected(AdapterView<?> arg0) {
			}
		});
    }
}
