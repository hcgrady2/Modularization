package com.study.logincomponent;

import android.app.Application;

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
        initialize(this);
    }

    @Override
    public void initialize(Application app) {
        instance =  app;
        //注册组件
        ServiceFactory.getInstance().setmLoginService(new LoginService());
    }
}
