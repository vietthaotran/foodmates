package com.example.foodmates;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class ProfileCreated extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.profile_created);
		ImageButton button = (ImageButton)findViewById(R.id.back);
		
		button.setOnClickListener(this);
	}
	public void onClick(View v){
		Intent intent = new Intent(ProfileCreated.this, ImportFriends.class);  
		startActivity(intent); 
		
	}

}