package com.mosheparfait.realsizehd;

import com.mosheparfait.realsizehd.R;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends Activity {
	
	private Button btn4tb, btn2tb, btn1tb, btn500gb, btn250gb, btn125gb, btn480gb, btn240gb, btn120gb;
	private EditText sizeTB, sizeGB, sizeMB;
	private CConverter cConvert;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		try{
			sizeTB = (EditText)findViewById(R.id.sizeTB);
			sizeGB = (EditText)findViewById(R.id.sizeGB);
			sizeMB = (EditText)findViewById(R.id.sizeMB);
			btn4tb = (Button)findViewById(R.id.btn_4tb);
			btn2tb = (Button)findViewById(R.id.btn_2tb);
			btn1tb = (Button)findViewById(R.id.btn_1tb);
			btn500gb = (Button)findViewById(R.id.btn_500gb);
			btn250gb = (Button)findViewById(R.id.btn_250gb);
			btn125gb = (Button)findViewById(R.id.btn_125gb);
			btn480gb = (Button)findViewById(R.id.btn_480gb);
			btn240gb = (Button)findViewById(R.id.btn_240gb);
			btn120gb = (Button)findViewById(R.id.btn_120gb);
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
	
	public void btn4tb_click(View v){
		cConvert = new CConverter("4TB");
		sizeTB.setText(cConvert.getStringTB());
		sizeGB.setText(cConvert.getStringGB());
		sizeMB.setText(cConvert.getStringMB());
	}
	
	public void btn2tb_click(View v){
		cConvert = new CConverter("2TB");
		sizeTB.setText(cConvert.getStringTB());
		sizeGB.setText(cConvert.getStringGB());
		sizeMB.setText(cConvert.getStringMB());
	}
	
	public void btn1tb_click(View v){
		cConvert = new CConverter("1TB");
		sizeTB.setText(cConvert.getStringTB());
		sizeGB.setText(cConvert.getStringGB());
		sizeMB.setText(cConvert.getStringMB());
	}
	
	public void btn500gb_click(View v){
		cConvert = new CConverter("500GB");
		sizeTB.setText(cConvert.getStringTB());
		sizeGB.setText(cConvert.getStringGB());
		sizeMB.setText(cConvert.getStringMB());
	}
	
	public void btn250gb_click(View v){
		cConvert = new CConverter("250GB");
		sizeTB.setText(cConvert.getStringTB());
		sizeGB.setText(cConvert.getStringGB());
		sizeMB.setText(cConvert.getStringMB());
	}
	
	public void btn125gb_click(View v){
		cConvert = new CConverter("125GB");
		sizeTB.setText(cConvert.getStringTB());
		sizeGB.setText(cConvert.getStringGB());
		sizeMB.setText(cConvert.getStringMB());
	}
	
	public void btn480gb_click(View v){
		cConvert = new CConverter("480GB");
		sizeTB.setText(cConvert.getStringTB());
		sizeGB.setText(cConvert.getStringGB());
		sizeMB.setText(cConvert.getStringMB());
	}
	
	public void btn240gb_click(View v){
		cConvert = new CConverter("240GB");
		sizeTB.setText(cConvert.getStringTB());
		sizeGB.setText(cConvert.getStringGB());
		sizeMB.setText(cConvert.getStringMB());
	}
	
	public void btn120gb_click(View v){
		cConvert = new CConverter("120GB");
		sizeTB.setText(cConvert.getStringTB());
		sizeGB.setText(cConvert.getStringGB());
		sizeMB.setText(cConvert.getStringMB());
	}
}
