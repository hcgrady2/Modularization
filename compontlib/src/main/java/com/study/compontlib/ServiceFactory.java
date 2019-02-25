package com.study.compontlib;

import com.study.compontlib.impl.EmptyLoginService;
import com.study.compontlib.impl.EmptyMineService;
import com.study.compontlib.service.ILoginService;
import com.study.compontlib.service.IMineServee;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
 */

public class ServiceFactory {
    private static final ServiceFactory instance  = new ServiceFactory();
    public static ServiceFactory getInstance(){
        return instance;
    }

    private ServiceFactory(){}

    private ILoginService mLoginService;
    private IMineServee mMineService;



    public ILoginService getmLoginService() {
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
