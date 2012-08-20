package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import android.app.Activity;
import android.app.AlertDialog;

public class MainActivity extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
    	super.onCreateOptionsMenu(menu);
    	final Activity activity = this;
    	MenuItem item1 = menu.add("menu 1");
    	MenuItem item2 = menu.add("menu 2");
    	item1.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
			
			public boolean onMenuItemClick(MenuItem item) {
				Toast toast = Toast.makeText(activity, "This is Menu1.", Toast.LENGTH_SHORT);
				toast.show();
				return false;
			}
		});
    	item2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
			
			public boolean onMenuItemClick(MenuItem item) {
				AlertDialog.Builder builder = new AlertDialog.Builder(activity);
				builder.setMessage("This is Menu2.");
				builder.show();
				return false;
			}
		});
    	return true;
    }
}
