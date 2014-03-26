package com.example.foodmates;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Login extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		Button button = (Button)findViewById(R.id.login);
		button.setOnClickListener(this);
	}
	public void onClick(View v){
		Intent intent = new Intent(Login.this, Likes.class);  
		startActivity(intent); 
		
	}

}
