package org.yyx.catchexception;

import org.yyx.catchexception.R;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

	private String s;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println(s.equals("null"));
	}

}
