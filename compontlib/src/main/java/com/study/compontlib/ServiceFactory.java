package com.study.compontlib;

import android.util.Log;

import com.study.compontlib.impl.EmptyLoginService;
import com.study.compontlib.impl.EmptyMineService;
import com.study.compontlib.service.ILoginService;
import com.study.compontlib.service.IMineServee;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
 */


/**
 * ServiceFactory 主要是管理各个Module 的 交互 Service
 */
public class ServiceFactory {
    private static final ServiceFactory instance  = new ServiceFactory();
    public static ServiceFactory getInstance(){
        return instance;
    }

    private ServiceFactory(){}

    /**
     * 所有需要交互的组件都要定义Service并且定义好交互方法
     */
    private ILoginService mLoginService;
    private IMineServee mMineService;


    /**
     * 定义 getter 和 setter 方便管理
     */


    public ILoginService getmLoginService() {
        //当组件独立运行时，主工程不依赖组件，但是还是会执行相关方法，为了避免空指针，需要定义一个空 Service 实现
        if (mLoginService == null){
            mLoginService = new EmptyLoginService();
        }
        return mLoginService;
    }

    public void setmLoginService(ILoginService mLoginService) {
        this.mLoginService = mLoginService;
    }

    public IMineServee getmMineService() {
        if (mMineService == null){
            mMineService = new EmptyMineService();
        }
        return mMineService;
    }

    public void setmMineService(IMineServee mMineService) {
        this.mMineService = mMineService;
    }


}
