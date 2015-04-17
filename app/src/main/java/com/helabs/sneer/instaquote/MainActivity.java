package com.helabs.sneer.instaquote;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import java.util.Random;


public class MainActivity extends Activity {

	private static String[] INSPIRATIONAL = {
			"\"Start by doing what's necessary; then do what's possible; and suddenly you are doing the impossible.\"\n - Francis of Assisi",
			"\"The best and most beautiful things in the world cannot be seen or even touched - they must be felt with the heart.\"\n - Helen Keller",
			"\"Perfection is not attainable, but if we chase perfection we can catch excellence.\"\n - Vince Lombardi",
			"\"I can't change the direction of the wind, but I can adjust my sails to always reach my destination.\"\n - Jimmy Dean"
	};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		int randomQuote = new Random().nextInt(INSPIRATIONAL.length);
		startService(getIntent().<Intent>getParcelableExtra("SEND_MESSAGE").setAction(INSPIRATIONAL[randomQuote]));
		finish();
	}

}
