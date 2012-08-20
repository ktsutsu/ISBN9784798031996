package com.tsutsu.isbn9784798031996;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.widget.TextView;
import android.widget.Toast;
import android.app.Activity;
import android.app.AlertDialog;

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
    	final Activity activity = this;
    	menu.setHeaderTitle("Context menu");
    	menu.add("menu 1").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
			
			public boolean onMenuItemClick(MenuItem item) {
				Toast toast = Toast.makeText(activity, "This is Menu1.", Toast.LENGTH_SHORT);
				toast.show();
				return false;
			}
		});
    	menu.add("menu 2").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
			
			public boolean onMenuItemClick(MenuItem item) {
				AlertDialog.Builder builder = new AlertDialog.Builder(activity);
				builder.setMessage("This is Menu2.");
				builder.show();
				return false;
			}
		});
    	super.onCreateContextMenu(menu, v, menuInfo);
    }
}
