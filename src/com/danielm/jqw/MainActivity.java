package com.danielm.jqw;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class MainActivity extends Activity implements OnItemClickListener {
	private String[] fruits = {
			"Apple", "Orange", "Banana", "Pineapple", "Strawberry",
			"Lemons", "Limes", "Cherry", "Melon", "Mandarin", "Mango",
			"Papaya", "Peache", "Pear", "Plum", "Pomelo", "Tangarine"
	};
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_main);
		
		ListView listView = (ListView) findViewById(R.id.custom_list);
		listView.setOnItemClickListener(this);
		
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
		    R.layout.listview_row, R.id.title, this.fruits);

		// Assign adapter to ListView
		listView.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void onItemClick(AdapterView<?> parent, View view,
	    int position, long id) {
		
		Log.i("MainActivity", "onItemClick: "+ this.fruits[position]);
    }
}
