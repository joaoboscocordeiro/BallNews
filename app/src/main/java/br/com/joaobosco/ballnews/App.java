package br.com.joaobosco.ballnews;

import android.app.Application;

/**
 * Created by João Bosco on 18/07/2022.
 * e-mail - Support: ti.junior@gmail.com
 */
public class App extends Application {

    private static App instance;

    public static App getInstance() { return instance; }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }

}
