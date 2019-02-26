package com.study.logincomponent;

import android.app.Application;
import android.util.Log;

import com.study.compontlib.IAppComponet;
import com.study.compontlib.ServiceFactory;
import com.study.logincomponent.interfaces.LoginService;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
 */

public class LoginApp extends Application implements IAppComponet{

    public static Application instance;
    public static Application getApplication(){
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        //组件独立运行，会走 onCreate，还是会执行到 initialize
        initialize(this);
    }

    @Override
    public void initialize(Application app) {
        instance =  app;
        //注册组件
        /**
         * 无论是独立运行还是依赖module，都会执行此方法，并且初始化一个 LoginService
         */
        ServiceFactory.getInstance().setmLoginService(new LoginService());
    }
}
