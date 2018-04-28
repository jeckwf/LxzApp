package com.mo.lxz;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.mo.util.CommonDateUtil;


public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
	}

	private void initView() {
		final CommonDateUtil dateUtil= new CommonDateUtil();
		findViewById(R.id.tv_main_test).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View view) {
				dateUtil.getNowDate(MainActivity.this);
			}
		});
	}
}
