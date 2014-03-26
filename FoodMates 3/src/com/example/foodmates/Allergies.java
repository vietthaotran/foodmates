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
import android.widget.SimpleAdapter;

public class Allergies extends Activity implements OnClickListener {

	//private List<CheckBox> checkBoxs = new ArrayList<CheckBox>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.allergies);
		ListView listView = (ListView)findViewById(R.id.allergiesList);
		listView.setAdapter(new ArrayAdapter<String>(this, R.layout.allergy_item,getData()));
		Button button = (Button)findViewById(R.id.done);
		button.setOnClickListener(this);
		
		/*String[] checkBoxTest = new String[] {
				//add choices over there
				"Egg", "Sea Food", "Fruits", "Chilli"  
        };  
		//LinearLayout linearLayout = (LinearLayout) getLayoutInflater().inflate(R.layout.allergies, null);
		
		for(int i = 0; i < checkBoxTest.length; i++) {  
			
            CheckBox checkBoxLayout = (CheckBox)getLayoutInflater().inflate(R.layout.allergy_item, null);  
            checkBoxs.add(checkBoxLayout);  
            checkBoxs.get(i).setText(checkBoxTest[i]);  
            
            linearLayout.addView(checkBoxLayout, i);             
            setContentView(linearLayout);  
              
        }*/
	}
	private List<String> getData() {
		List<String> data=new ArrayList<String>();
		data.add("Eggs");
		data.add("Sea Food");
		data.add("Milk");
		data.add("Nuts");
		data.add("Soy");
		data.add("Garlic");
		data.add("Onion");
		data.add("Chilli");
		return data;
	}
	public void onClick(View v){
		Intent intent = new Intent(Allergies.this,HomePage.class);  
		startActivity(intent); 
		
	}

}