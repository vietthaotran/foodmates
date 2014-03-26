package com.example.foodmates;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.LinearLayout;
import android.widget.ListView;

public class Likes extends Activity implements OnClickListener {
	public Button btn1=null;
	//private List<CheckBox> checkBoxs = new ArrayList<CheckBox>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		//setContentView(R.layout.allergies);
		setContentView(R.layout.likes);
		ListView listView = (ListView)findViewById(R.id.likeList);
		listView.setAdapter(new ArrayAdapter<String>(this, R.layout.like_item,getData()));
		//Button button = (Button)findViewById(R.id.done);
		//button.setOnClickListener(this);
		
        btn1=(Button)findViewById(R.id.done);
        btn1.setOnClickListener(listener);
		/*String[] checkBoxTest = new String[] {
				//add choices over there
				"Chinese Food", "Sea Food", "French Food", "Ramen"  
        };  
		LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.likes, null);
		
		for(int i = 0; i < checkBoxTest.length; i++) {  
			
            CheckBox checkBoxLayout = (CheckBox)getLayoutInflater().inflate(R.layout.like_item, null);  
            checkBoxs.add(checkBoxLayout);  
            checkBoxs.get(i).setText(checkBoxTest[i]);  
            
            linearLayout.addView(checkBoxLayout, i);             
            setContentView(linearLayout);  
              
        }*/
	}
	
	private OnClickListener listener =new OnClickListener()
	 {
		public void onClick(View v)
	  {
		   // TODO Auto-generated method stub
		   Button btn=(Button)v;
		   switch (btn.getId())
		   {
		    case R.id.done:
		    	Intent intent = new Intent(Likes.this, Allergies.class);  
				startActivity(intent); 
		     break;
		    
		    default:
		     break;
		   }
		   
		  }
		 };
		
		
	private List<String> getData() {
		List<String> data=new ArrayList<String>();
		data.add("Local Delicious");
		data.add("Chinese Cuisine");
		data.add("Western Cuisine");
		data.add("Japanese Cuisine");
		data.add("Korean Cuisine");
		data.add("Fastfood");
		data.add("Sea Food");
		data.add("Alcohol");
		return data;
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
	
	/*public void onClick(View v){
		Intent intent = new Intent(Likes.this, Allergies.class);  
		startActivity(intent); 
		
	}

*/
}

