package com.example.mycalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Calculator extends Activity {

	private int num1 = 0;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Button button0 = (Button) findViewById(R.id.button0);
		Button button1 = (Button) findViewById(R.id.button1);
		Button button2 = (Button) findViewById(R.id.button2);
		Button button3 = (Button) findViewById(R.id.button3);
		Button button4 = (Button) findViewById(R.id.button4);
		Button button5 = (Button) findViewById(R.id.button5);
		Button button6 = (Button) findViewById(R.id.button6);
		Button button7 = (Button) findViewById(R.id.button7);
		Button button8 = (Button) findViewById(R.id.button8);
		Button button9 = (Button) findViewById(R.id.button9);
		Button button_quit = (Button) findViewById(R.id.button_quit);

		button0.setOnClickListener(mClickListener_button0);
		button1.setOnClickListener(mClickListener_button1);
		button2.setOnClickListener(mClickListener_button2);
		button3.setOnClickListener(mClickListener_button3);
		button4.setOnClickListener(mClickListener_button4);
		button5.setOnClickListener(mClickListener_button5);
		button6.setOnClickListener(mClickListener_button6);
		button7.setOnClickListener(mClickListener_button7);
		button8.setOnClickListener(mClickListener_button8);
		button9.setOnClickListener(mClickListener_button9);
		button_quit.setOnClickListener(mClickListener_button_quit);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	private Button.OnClickListener mClickListener_button0 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			num1 = num1 * 10 + 0;
			DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button1 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			num1 = num1 * 10 + 1;
			DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button2 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			num1 = num1 * 10 + 2;
			DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button3 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			num1 = num1 * 10 + 3;
			DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button4 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			num1 = num1 * 10 + 4;
			DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button5 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			num1 = num1 * 10 + 5;
			DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button6 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			num1 = num1 * 10 + 6;
			DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button7 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			num1 = num1 * 10 + 7;
			DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button8 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			num1 = num1 * 10 + 8;
			DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button9 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			num1 = num1 * 10 + 9;
			DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button_quit = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			finish();
		}
	};

	public void DisplayToast(String str) {
		Toast toast = Toast.makeText(this, str, Toast.LENGTH_SHORT);
		// 设置toast显示的位置
		toast.setGravity(Gravity.BOTTOM, 0, 600);
		// 显示该Toast
		toast.show();
	}
}
