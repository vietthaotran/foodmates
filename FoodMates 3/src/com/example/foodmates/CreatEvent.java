package com.example.foodmates;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class CreatEvent extends Activity implements OnClickListener {
	public ImageButton btn1=null;
	public ImageButton btn2=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.creat_event);
		
		btn2=(ImageButton)findViewById(R.id.ok_add);
        btn2.setOnClickListener(listener);
        btn1=(ImageButton)findViewById(R.id.add_parti);
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
	    case R.id.add_parti:
	    	Intent intent = new Intent(CreatEvent.this, AddParticipant.class);  
			startActivity(intent); 
	     break;
	    case R.id.ok_add:
	    	Intent intent2 = new Intent(CreatEvent.this, Restaurant.class);  
			startActivity(intent2); 
	     break;
	    default:
	     break;
	   }
	   
	  }
	 };


	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.creat_event, menu);
		return true;
	}
	
	public void onClick(View v){
		
		
	}

}
