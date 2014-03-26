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

public class Restaurant extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.restaurant);
		ListView listView = (ListView)findViewById(R.id.rest_list);
		SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.restaurant_item, new String[]{"text1","text2","text3","text4","text5"}, new int[]{R.id.re1,R.id.re2,R.id.re3,R.id.re4,R.id.re5});
		listView.setAdapter(adapter);
	}
	
	private ArrayList<Map<String, Object>> getData() {
		// TODO Auto-generated method stub
		ArrayList<Map<String, Object>> data=new ArrayList<Map<String,Object>>();
		Map<String, Object> item;
		item=new HashMap<String, Object>();
		item.put("text1", "8.6");
		item.put("text2", "100% Match");
		item.put("text3", "Standing Sushi Bar");
		item.put("text4", "8 Queen St");
		item.put("text5", "250m");
		data.add(item);
		item=new HashMap<String, Object>();
		item.put("text1", "8.3");
		item.put("text2", "100% Match");
		item.put("text3", "Timbre");
		item.put("text4", "45 Armenian St");
		item.put("text5", "450m");
		data.add(item);
		item=new HashMap<String, Object>();
		item.put("text1", "8.2");
		item.put("text2", "100% Match");
		item.put("text3", "Tim Ho Wan");
		item.put("text4", "68 Orchard Road, #01-29A");
		item.put("text5", "500m");
		data.add(item);
		item=new HashMap<String, Object>();
		item.put("text1", "7.9");
		item.put("text2", "90% Match");
		item.put("text3", "Food for thought");
		item.put("text4", "8 Queen St");
		item.put("text5", "250m");
		data.add(item);
		item=new HashMap<String, Object>();
		item.put("text1", "7.5");
		item.put("text2", "90% Match");
		item.put("text3", "Molly Roffey's Irish Pub");
		item.put("text4", "51 Bras Basah Rd");
		item.put("text5", "150m");
		data.add(item);
		
		return data;
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}