package com.tsutsu.isbn9784798031996;

import java.util.*;

import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.app.ListActivity;

public class MainActivity extends ListActivity {
	private ArrayAdapter<String> arrayadapter = null;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ListView list = this.getListView();
        list.setChoiceMode(ListView.CHOICE_MODE_MULTIPLE);
        List<String> arr = new ArrayList<String>();
        arr.add("First item");
        arr.add("Second item");
        arr.add("Third item");
        arrayadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_multiple_choice, arr);
        this.setListAdapter(arrayadapter);
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	String msg = "Selected: ";
    	for (int i = 0; i < l.getChildCount(); i++) {
        	CheckedTextView check = (CheckedTextView)l.getChildAt(i);
        	if (check.isChecked()) {
        		if (check != v) {
        			msg += "\n" + check.getText();
				}
    		} else if (check == v) {
    			msg += "\n" + check.getText();
    		}
		}
    	Toast toast = Toast.makeText(this, msg, Toast.LENGTH_SHORT);
    	toast.show();
    	super.onListItemClick(l, v, position, id);
    }
}
