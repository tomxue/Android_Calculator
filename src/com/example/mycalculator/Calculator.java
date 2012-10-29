package com.example.mycalculator;

import android.os.Bundle;
import android.app.Activity;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Calculator extends Activity {

	private int num1 = 0;
	private int num2 = 0;
	private float num3 = 0;
	private int operator1 = 0;
	private int operator2 = 0;

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
		Button button_ac = (Button) findViewById(R.id.button_ac);
		Button button_mul = (Button) findViewById(R.id.button_mul);
		Button button_div = (Button) findViewById(R.id.button_div);
		Button button_add = (Button) findViewById(R.id.button_add);
		Button button_minus = (Button) findViewById(R.id.button_minus);
		Button button_equal = (Button) findViewById(R.id.button_equal);

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
		button_ac.setOnClickListener(mClickListener_button_ac);
		button_mul.setOnClickListener(mClickListener_button_mul);
		button_div.setOnClickListener(mClickListener_button_div);
		button_add.setOnClickListener(mClickListener_button_add);
		button_minus.setOnClickListener(mClickListener_button_minus);
		button_equal.setOnClickListener(mClickListener_button_equal);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	private Button.OnClickListener mClickListener_button0 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {

			EditText editText_result = (EditText) findViewById(R.id.editText_result);

			if (operator1 == 0) {
				num1 = num1 * 10 + 0;
				editText_result.setText(Integer.toString(num1));
			} else {
				num2 = num2 * 10 + 0;
				editText_result.setText(Integer.toString(num2));
			}

			// DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button1 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {

			EditText editText_result = (EditText) findViewById(R.id.editText_result);

			if (operator1 == 0) {
				num1 = num1 * 10 + 1;
				editText_result.setText(Integer.toString(num1));
			} else {
				num2 = num2 * 10 + 1;
				editText_result.setText(Integer.toString(num2));
			}

			// DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button2 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {

			EditText editText_result = (EditText) findViewById(R.id.editText_result);

			if (operator1 == 0) {
				num1 = num1 * 10 + 2;
				editText_result.setText(Integer.toString(num1));
			} else {
				num2 = num2 * 10 + 2;
				editText_result.setText(Integer.toString(num2));
			}

			// DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button3 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {

			EditText editText_result = (EditText) findViewById(R.id.editText_result);

			if (operator1 == 0) {
				num1 = num1 * 10 + 3;
				editText_result.setText(Integer.toString(num1));
			} else {
				num2 = num2 * 10 + 3;
				editText_result.setText(Integer.toString(num2));
			}

			// DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button4 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {

			EditText editText_result = (EditText) findViewById(R.id.editText_result);

			if (operator1 == 0) {
				num1 = num1 * 10 + 4;
				editText_result.setText(Integer.toString(num1));
			} else {
				num2 = num2 * 10 + 4;
				editText_result.setText(Integer.toString(num2));
			}

			// DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button5 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {

			EditText editText_result = (EditText) findViewById(R.id.editText_result);

			if (operator1 == 0) {
				num1 = num1 * 10 + 5;
				editText_result.setText(Integer.toString(num1));
			} else {
				num2 = num2 * 10 + 5;
				editText_result.setText(Integer.toString(num2));
			}

			// DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button6 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {

			EditText editText_result = (EditText) findViewById(R.id.editText_result);

			if (operator1 == 0) {
				num1 = num1 * 10 + 6;
				editText_result.setText(Integer.toString(num1));
			} else {
				num2 = num2 * 10 + 6;
				editText_result.setText(Integer.toString(num2));
			}

			// DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button7 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {

			EditText editText_result = (EditText) findViewById(R.id.editText_result);

			if (operator1 == 0) {
				num1 = num1 * 10 + 7;
				editText_result.setText(Integer.toString(num1));
			} else {
				num2 = num2 * 10 + 7;
				editText_result.setText(Integer.toString(num2));
			}

			// DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button8 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {

			EditText editText_result = (EditText) findViewById(R.id.editText_result);

			if (operator1 == 0) {
				num1 = num1 * 10 + 8;
				editText_result.setText(Integer.toString(num1));
			} else {
				num2 = num2 * 10 + 8;
				editText_result.setText(Integer.toString(num2));
			}

			// DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button9 = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {

			EditText editText_result = (EditText) findViewById(R.id.editText_result);

			if (operator1 == 0) {
				num1 = num1 * 10 + 9;
				editText_result.setText(Integer.toString(num1));
			} else {
				num2 = num2 * 10 + 9;
				editText_result.setText(Integer.toString(num2));
			}

			// DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button_quit = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			// DisplayToast("Quit the application");
			finish();
		}
	};

	private Button.OnClickListener mClickListener_button_ac = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			num1 = 0;
			num2 = 0;
			operator1 = 0;
			operator2 = 0;

			EditText editText_result = (EditText) findViewById(R.id.editText_result);
			editText_result.setText("0");

			// DisplayToast(Integer.toString(num1));
		}
	};

	private Button.OnClickListener mClickListener_button_mul = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			operator1 = 1;
			// DisplayToast("multiply");
		}
	};

	private Button.OnClickListener mClickListener_button_div = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			operator1 = 2;
			// DisplayToast("divide");
		}
	};

	private Button.OnClickListener mClickListener_button_add = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			operator1 = 3;
			// DisplayToast("add");
		}
	};

	private Button.OnClickListener mClickListener_button_minus = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			operator1 = 1;
			// DisplayToast("minus");
		}
	};

	private Button.OnClickListener mClickListener_button_equal = new Button.OnClickListener() {
		@Override
		public void onClick(View arg0) {
			operator2 = 1;
			if (operator1 == 1) // multiply
				num3 = num1 * num2;
			else if (operator1 == 2) // divide
				num3 = (float) num1 / num2;
			else if (operator1 == 3) // add
				num3 = num1 + num2;
			else if (operator1 == 4) // minus
				num3 = num1 - num2;

			EditText editText_result = (EditText) findViewById(R.id.editText_result);
			editText_result.setText(Float.toString(num3));

			num1 = 0;
			num2 = 0;
			operator1 = 0;
			operator2 = 0;

			// DisplayToast(Float.toString(num3));
		}
	};

	public void DisplayToast(String str) {
		Toast toast = Toast.makeText(this, str, Toast.LENGTH_SHORT);
		// set the position of toast
		toast.setGravity(Gravity.BOTTOM, 0, 600);
		toast.show();
	}
}
