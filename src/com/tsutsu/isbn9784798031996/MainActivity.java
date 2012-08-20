package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.app.Activity;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
    	menu.add("menu 1");
    	menu.add("menu 2");
    	return true;
    }

    @Override
    public boolean onMenuOpened(int featureId, Menu menu) {
    	Toast toast = Toast.makeText(this, "open menu...", Toast.LENGTH_SHORT);
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
    public boolean onOptionsItemSelected(MenuItem item) {
    	Toast toast = Toast.makeText(this, "select option menu: " + item.getTitle(), Toast.LENGTH_SHORT);
    	toast.show();
    	return super.onOptionsItemSelected(item);
    }

    @Override
    public void onOptionsMenuClosed(Menu menu) {
    	Toast toast = Toast.makeText(this, "close menu!", Toast.LENGTH_SHORT);
    	toast.show();
    	super.onOptionsMenuClosed(menu);
    }
}
