package cn.bgs.zidingyi;

import android.app.Application;

/**
 * Created by Administrator on 2018/5/9.
 */

public class MyApplication extends Application {
    static MyApplication app;
    @Override
    public void onCreate() {
        super.onCreate();
        app=this;
    }
    public static MyApplication getApp(){
        return app;
    }
}