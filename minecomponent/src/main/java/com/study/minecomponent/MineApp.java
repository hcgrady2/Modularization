package com.study.minecomponent;

import android.app.Application;

import com.study.compontlib.IAppComponet;
import com.study.compontlib.ServiceFactory;
import com.study.minecomponent.services.MineService;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
 */

public class MineApp extends Application implements IAppComponet {


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
    public void initialize(Application application) {
        instance = application;
        ServiceFactory.getInstance().setmMineService(new MineService());
    }
}
