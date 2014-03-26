package com.example.foodmates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ListView;
import android.widget.SimpleAdapter;

public class Restaurant1 extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.restaurant1);
		ListView listView = (ListView)findViewById(R.id.rest_list);
		SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.restaurant_item, new String[]{"text1","text2","text3","text4","text5"}, new int[]{R.id.re1,R.id.re2,R.id.re3,R.id.re4,R.id.re5});
		listView.setAdapter(adapter);
	}
	
	private ArrayList<Map<String, Object>> getData() {
		// TODO Auto-generated method stub
		ArrayList<Map<String, Object>> data=new ArrayList<Map<String,Object>>();
		Map<String, Object> item;
		item=new HashMap<String, Object>();
		item.put("text1", "8.4");
		item.put("text2", "100% Match");
		item.put("text3", "Ma Maison Restaurant");
		item.put("text4", "#02-51, Bugis Junction");
		item.put("text5", "100m");
		data.add(item);
		item=new HashMap<String, Object>();
		item.put("text1", "8.3");
		item.put("text2", "100% Match");
		item.put("text3", "Ramen Champion");
		item.put("text4", "#04-08/10 Bugis+");
		item.put("text5", "150m");
		data.add(item);
		item=new HashMap<String, Object>();
		item.put("text1", "8.2");
		item.put("text2", "100% Match");
		item.put("text3", "Saveur");
		item.put("text4", "5 Purvis St");
		item.put("text5", "400m");
		data.add(item);
		item=new HashMap<String, Object>();
		item.put("text1", "7.9");
		item.put("text2", "90% Match");
		item.put("text3", "Poulet");
		item.put("text4", "#04-14, Bugis+");
		item.put("text5", "150m");
		data.add(item);
		item=new HashMap<String, Object>();
		item.put("text1", "7.5");
		item.put("text2", "90% Match");
		item.put("text3", "CoCo Ichibanya Curry");
		item.put("text4", "#01-10, Bugis+");
		item.put("text5", "150m");
		data.add(item);
		
		return data;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}