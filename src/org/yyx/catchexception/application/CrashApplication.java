package org.yyx.catchexception.application;

import org.yyx.catchexception.utils.CrashHandler;

import android.app.Application;

/**
 * @author yyx
 * @2015-5-15
 * @desperation:全局Application
 * 
 */
public class CrashApplication extends Application {
	@Override
	public void onCreate() {
		super.onCreate();
		CrashHandler crashHandler = CrashHandler.getInstance();
		crashHandler.init(getApplicationContext());
	}
}
