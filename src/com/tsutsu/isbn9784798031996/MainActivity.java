package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView text1 = (TextView)this.findViewById(R.id.textView1);
        this.registerForContextMenu(text1);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
    		ContextMenuInfo menuInfo) {
    	menu.setHeaderTitle("Context menu");
    	menu.add("menu 1");
    	menu.add("menu 2");
    	super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
    	// this method is not called when open context menu...
    	Toast toast = Toast.makeText(this, "open context menu...", Toast.LENGTH_SHORT);
    	toast.show();
    	return super.onMenuOpened(featureId, menu);
    }

    @Override
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
		Toast toast = Toast.makeText(this, "select menu: " + item.getTitle(), Toast.LENGTH_SHORT);
		toast.show();
    	return super.onMenuItemSelected(featureId, item);
    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
		Toast toast = Toast.makeText(this, "select context menu: " + item.getTitle(), Toast.LENGTH_SHORT);
		toast.show();
    	return super.onContextItemSelected(item);
    }

    @Override
    public void onContextMenuClosed(Menu menu) {
		Toast toast = Toast.makeText(this, "close context menu!", Toast.LENGTH_SHORT);
		toast.show();
    	super.onContextMenuClosed(menu);
    }
}
