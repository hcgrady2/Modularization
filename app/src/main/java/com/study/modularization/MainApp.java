package com.study.modularization;

import android.app.Application;

import com.study.compontlib.AppConfig;
import com.study.compontlib.IAppComponet;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
 */

public class MainApp extends Application implements IAppComponet{

    private static MainApp application;
    public static MainApp getApplication(){
        return application;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        initialize(this);
    }

    @Override
    public void initialize(Application app) {
        application = (MainApp)app;
        for (String componet: AppConfig.CONPONENTS){
            try {
                Class<?> clazz = Class.forName(componet);
                Object object = clazz.newInstance();

                if (object instanceof IAppComponet){
                    ((IAppComponet)object).initialize(this);
                }
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

}
