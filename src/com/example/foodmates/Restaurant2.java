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

public class Restaurant2 extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.restaurant2);
		ListView listView = (ListView)findViewById(R.id.rest_list);
		SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.restaurant_item, new String[]{"text1","text2","text3","text4","text5"}, new int[]{R.id.re1,R.id.re2,R.id.re3,R.id.re4,R.id.re5});
		listView.setAdapter(adapter);
	}
	
	private ArrayList<Map<String, Object>> getData() {
		// TODO Auto-generated method stub
		ArrayList<Map<String, Object>> data=new ArrayList<Map<String,Object>>();
		Map<String, Object> item;
		item=new HashMap<String, Object>();
		item.put("text1", "8.8");
		item.put("text2", "100% Match");
		item.put("text3", "Marche");
		item.put("text4", "#01-39/46 313@Somerset");
		item.put("text5", "700m");
		data.add(item);
		item=new HashMap<String, Object>();
		item.put("text1", "8.7");
		item.put("text2", "100% Match");
		item.put("text3", "Ippudo");
		item.put("text4", "#04-02/04 Mandarin Gallery");
		item.put("text5", "500m");
		data.add(item);
		item=new HashMap<String, Object>();
		item.put("text1", "8.2");
		item.put("text2", "90% Match");
		item.put("text3", "4Fingers Crispy Chicken");
		item.put("text4", "#B4-06A, ION Orchard");
		item.put("text5", "100m");
		data.add(item);
		item=new HashMap<String, Object>();
		item.put("text1", "7.7");
		item.put("text2", "90% Match");
		item.put("text3", "Eighteen Chefs");
		item.put("text4", "#04-02 Orchard Cineleisure");
		item.put("text5", "500m");
		data.add(item);
		item=new HashMap<String, Object>();
		item.put("text1", "7.5");
		item.put("text2", "80% Match");
		item.put("text3", "Din Tai Fung");
		item.put("text4", "#B1-03 Paragon");
		item.put("text5", "300m");
		data.add(item);
		
		return data;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}