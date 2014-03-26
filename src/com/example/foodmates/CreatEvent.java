package com.example.foodmates;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;

public class CreatEvent extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.creat_event);
		ImageButton button = (ImageButton)findViewById(R.id.add_parti);
		
		button.setOnClickListener(this);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.creat_event, menu);
		return true;
	}
	
	public void onClick(View v){
		Intent intent = new Intent(CreatEvent.this, AddParticipant.class);  
		startActivity(intent); 
		
	}

}
