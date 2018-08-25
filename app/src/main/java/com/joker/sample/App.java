package com.joker.sample;

import android.app.Application;
import android.content.Context;
import android.util.Log;

/**
 * Created by @author joker on 2018/8/25.
 */
public class App extends Application {
  @Override protected void attachBaseContext(Context base) {
    super.attachBaseContext(base);
    Log.e("Sample", "应用 Application 正在 attach context " + base);
  }

  @Override public void onCreate() {
    super.onCreate();
    Log.e("Sample", "应用 Application 正在使用 " + this + " 初始化");
  }
}
