package com.joker.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    Log.e("Sample", "Activity 已启动");
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
  }
}
