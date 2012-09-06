package com.tsutsu.isbn9784798031996;

import java.util.*;

import android.os.Bundle;
import android.view.*;
import android.widget.*;
import android.app.ListActivity;
import android.content.Context;
import android.graphics.Color;

public class MainActivity extends ListActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ArrayList<MyItem> arr = new ArrayList<MyItem>();
        arr.add(new MyItem("Yamada", "Taro", 36, Color.GREEN));
        arr.add(new MyItem("Tanaka", "Hanako", 28, Color.CYAN));
        arr.add(new MyItem("Syoda", "Tuyano", 10, Color.RED));
        this.setListAdapter(new MyAdapter(this, arr));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
    	MyItemView view = (MyItemView)v;
    	Toast toast = Toast.makeText(this, view.toString(), Toast.LENGTH_SHORT);
    	toast.show();
    	super.onListItemClick(l, v, position, id);
    }
}

class MyItem {
	private long id = 0;
	private  String name1 = null;
	private  String name2 = null;
	private int color = 0;
	private int age = 0;

	public MyItem(String name1, String name2, int age, int color) {
		super();
		this.id = new Date().getTime();
		this.name1 = name1;
		this.name2 = name2;
		this.age = age;
		this.color = color;
	}

	public long getId() {
		return id;
	}

	public String getSecondName() {
		return name1;
	}

	public void setSecondName(String name1) {
		this.name1 = name1;
	}

	public String getFirstName() {
		return name2;
	}

	public void setFirstName(String name2) {
		this.name2 = name2;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getColor() {
		return color;
	}

	public void setColor(int color) {
		this.color = color;
	}
}

class MyItemView extends LinearLayout {
	public TextView name1 = null;
	public TextView name2 = null;
	public TextView age = null;

	public MyItemView(Context context, MyItem item) {
		super(context);
		this.setOrientation(LinearLayout.VERTICAL);
		name1 = new TextView(context);
		name1.setTextSize(12);
		name1.setText(item.getSecondName());
		name1.setTextColor(Color.BLACK);
		name1.setBackgroundColor(item.getColor());
		this.addView(name1);
		name2 = new TextView(context);
		name2.setTextSize(20);
		name2.setText(item.getFirstName());
		name2.setTextColor(item.getColor());
		this.addView(name2);
		age = new TextView(context);
		age.setTextSize(12);
		age.setText("age: " + item.getAge());
		this.addView(age);
	}

	@Override
	public String toString() {
		return "MyItemView\nname: " + name1.getText() + "-" + name2.getText() + ",\nage: " + age.getText();
	}
}

class MyAdapter extends BaseAdapter {
	private ArrayList<MyItem> data = null;
	private Context context = null;

	public MyAdapter(Context context, ArrayList<MyItem> data) {
		super();
		this.data = data;
		this.context = context;
	}

	public int getCount() {
		return data.size();
	}

	public Object getItem(int arg0) {
		return data.get(arg0);
	}

	public long getItemId(int arg0) {
		return data.get(arg0).getId();
	}

	public View getView(int arg0, View arg1, ViewGroup arg2) {
		return new MyItemView(context, data.get(arg0));
	}
}