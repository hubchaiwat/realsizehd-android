package com.mosheparfait.realsizehd;

import com.mosheparfait.realsizehd.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;



public class MainActivity extends Activity {
	
	private TextView sizeTB, sizeGB, sizeMB;
	private CConverter cConvert;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try{
			sizeTB = (TextView)findViewById(R.id.sizeTB);
			sizeGB = (TextView)findViewById(R.id.sizeGB);
			sizeMB = (TextView)findViewById(R.id.sizeMB);
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	private void calSize(String strSize){
		cConvert = new CConverter(strSize);
		sizeTB.setText(cConvert.getStringTB());
		sizeGB.setText(cConvert.getStringGB());
		sizeMB.setText(cConvert.getStringMB());
	}
	
	public void btnSize1_click(View v){
		calSize("4 TB");
	}
	
	public void btnSize2_click(View v){
		calSize("2 TB");
	}
	
	public void btnSize3_click(View v){
		calSize("1 TB");
	}
	
	public void btnSize4_click(View v){
		calSize("500 GB");
	}
	
	public void btnSize5_click(View v){
		calSize("250 GB");
	}
	
	public void btnSize6_click(View v){
		calSize("125 GB");
	}
	
	public void btnSize7_click(View v){
		calSize("480 GB");
	}
	
	public void btnSize8_click(View v){
		calSize("240 GB");
	}
	
	public void btnSize9_click(View v){
		calSize("120 GB");
	}
	
	public void btnSize10_click(View v){
		calSize("256 GB");
	}
	
	public void btnSize11_click(View v){
		calSize("128 GB");
	}
	
	public void btnSize12_click(View v){
		calSize("64 GB");
	}
	
	public void btnSize13_click(View v){
		calSize("32 GB");
	}
	
	public void btnSize14_click(View v){
		calSize("16 GB");
	}
	
	public void btnSize15_click(View v){
		calSize("8 GB");
	}
}
