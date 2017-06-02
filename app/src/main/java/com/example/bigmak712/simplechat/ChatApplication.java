package com.example.bigmak712.simplechat;

import android.app.Application;
import android.content.res.Configuration;

import com.parse.Parse;
import com.parse.interceptors.ParseLogInterceptor;

/**
 * Created by bigmak712 on 6/1/17.
 */

public class ChatApplication extends Application {
    //Called when the application is starting, before any other objects have been created
    @Override
    public void onCreate() {
        super.onCreate();
        // Required initialization logic here!
        // set applicationId and server based on the values in the Heroku settings.
        // any network interceptors must be added with the Configuration Builder given this syntax
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("93bd0b59a90d46b1999e484431b83f41") // should correspond to APP_ID env variable
                .addNetworkInterceptor(new ParseLogInterceptor())
                .server("https://simplechatclient.herokuapp.com/parse/").build());
    }

    // Called by the system when the device configuration changes while your component is running.
    // Overriding this method is totally optional!
    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
    }

    // This is called when the overall system is running low on memory,
    // and would like actively running processes to tighten their belts.
    // Overriding this method is totally optional!
    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

}
