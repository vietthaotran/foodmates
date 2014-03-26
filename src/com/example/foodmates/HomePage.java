package com.example.foodmates;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.app.Activity;
import android.content.Intent;

public class HomePage extends Activity implements OnClickListener {
	public ImageButton btn1=null;
	public ImageButton btn2=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home_page);
		ListView listView = (ListView)findViewById(R.id.events);
		//Button button = (Button)findViewById(R.id.createvent);
		SimpleAdapter adapter = new SimpleAdapter(this, getData(), R.layout.c_event, new String[]{"text1","text2","text3","text4","text5"}, new int[]{R.id.event1,R.id.event2,R.id.event3,R.id.event4,R.id.event5});
		listView.setAdapter(adapter);
		//setContentView(R.layout.home_page);
		//setContentView(listView);
		listView.setOnItemClickListener(listener2);
		//button.setOnClickListener(this);
		btn2=(ImageButton)findViewById(R.id.createvent);
        btn2.setOnClickListener(listener);
        btn1=(ImageButton)findViewById(R.id.exchange);
        btn1.setOnClickListener(listener);
		}
	private OnClickListener listener =new OnClickListener()
	 {
	  
	  @Override
	  public void onClick(View v)
	  {
	   // TODO Auto-generated method stub
		  ImageButton btn=(ImageButton)v;
	   switch (btn.getId())
	   {
	    case R.id.exchange:
	    	Intent intent = new Intent(HomePage.this, HomePage2.class);  
			startActivity(intent); 
	     break;
	    case R.id.createvent:
	    	Intent intent2 = new Intent(HomePage.this, CreatEvent.class);  
			startActivity(intent2); 
	     break;
	    default:
	     break;
	   }
	   
	  }
	 };
	

	private ArrayList<Map<String, Object>> getData() {
		// TODO Auto-generated method stub
		ArrayList<Map<String, Object>> data=new ArrayList<Map<String,Object>>();
		Map<String, Object> item;
		item=new HashMap<String, Object>();
		item.put("text1", "18.04");
		item.put("text2", "7:30 PM");
		item.put("text3", "IDP Team Dinner");
		item.put("text4", "Standing Sushi Bar");
		item.put("text5", "8 Queen St, 188535");
		data.add(item);
		item=new HashMap<String, Object>();
		item.put("text1", "28.04");
		item.put("text2", "8:00 PM");
		item.put("text3", "TGFYP Ends Drink Night");
		item.put("text4", "The Mad Men Attic Bar");
		item.put("text5", "11 North Canal Rd, 048826");
		data.add(item);
		
		return data;
	}
	OnItemClickListener listener2 = new OnItemClickListener() {
	
		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			// TODO Auto-generated method stub
			
		}
		
	};
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
	//public void onClick(View v){
	//	Intent intent = new Intent(HomePage.this, CreatEvent.class);  
//		startActivity(intent); 
		
//	}

}
