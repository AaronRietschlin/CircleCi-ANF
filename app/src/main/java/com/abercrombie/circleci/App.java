package com.abercrombie.circleci;

import android.app.Application;
import android.widget.Toast;

/**
 * Created by ariets on 1/19/16.
 */
public class App extends Application {

  @Override public void onCreate() {
    super.onCreate();
    String test = getResources().getString(R.string.action_settings);
    Toast.makeText(this, test, Toast.LENGTH_SHORT).show();
  }
}
