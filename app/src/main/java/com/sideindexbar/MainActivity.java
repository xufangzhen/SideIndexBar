package com.sideindexbar;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Created by xufangzhen on 2016/6/4.
 */
public class MainActivity extends Activity {

	private TextView mText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		mText = (TextView) findViewById(R.id.text_dialog);

		SideIndexBar indexBar = (SideIndexBar) findViewById(R.id.index_bar);
		indexBar.setLetters("ABCDEFHIJKLMOPQSTUVXYZ#");
		indexBar.setTextView(mText);
		indexBar.setOnLetterChangedListener(new SideIndexBar.OnLetterChangedListener() {
			@Override
			public void onChanged(String s, int position) {
				Log.e("SideIndexBar", s + " position:" + position);
			}
		});
	}
}
