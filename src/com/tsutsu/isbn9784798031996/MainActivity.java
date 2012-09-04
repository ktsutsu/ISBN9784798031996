package com.tsutsu.isbn9784798031996;

import java.util.*;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.CheckedTextView;
import android.widget.ListView;
import android.widget.Toast;
import android.app.ListActivity;

public class MainActivity extends ListActivity {
	private ArrayAdapter<String> arrayadapter = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView list = this.getListView();
        list.setChoiceMode(ListView.CHOICE_MODE_SINGLE);
        List<String> arr = new ArrayList<String>();
        arr.add("First item");
        arr.add("Second item");
        arr.add("Third item");
        arrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_single_choice, arr);
        this.setListAdapter(arrayadapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	CheckedTextView check = (CheckedTextView)v;
    	Toast toast = Toast.makeText(this, "you selected: " + check.getText(), Toast.LENGTH_SHORT);
    	toast.show();
    	super.onListItemClick(l, v, position, id);
    }
}
