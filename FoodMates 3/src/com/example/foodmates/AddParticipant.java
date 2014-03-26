package com.example.foodmates;

import java.util.ArrayList;
import java.util.List;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;

public class AddParticipant extends Activity implements OnClickListener {
	public ImageButton btn1=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_participant);
		ListView listView = (ListView)findViewById(R.id.participates);
		listView.setAdapter(new ArrayAdapter<String>(this, R.layout.easy_string,getData()));
		ImageButton button = (ImageButton)findViewById(R.id.back);
		
		button.setOnClickListener(this);
	}
	public void onClick(View v){
		Intent intent = new Intent(AddParticipant.this, CreatEvent.class);  
		startActivity(intent); 
	}

	private List<String> getData() {
		List<String> data=new ArrayList<String>();
		data.add("Richard Davis");
		data.add("Jeremy Zhong");
		data.add("Benjamin Gan");
		data.add("Lee Kok Khing");
		return data;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_participant, menu);
		return true;
	}

}
