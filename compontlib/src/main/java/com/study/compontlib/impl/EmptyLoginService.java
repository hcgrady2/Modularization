package com.study.compontlib.impl;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.study.compontlib.service.ILoginService;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
 */

/**
 * 定义空 Service  实现，防止主工程调用空指针
 */
public class EmptyLoginService implements ILoginService {
    @Override
    public void launch(Context context, String targetClass) {
    }

    @Override
    public Fragment newUuserInfoFragment(android.support.v4.app.FragmentManager fragmentManager, int viewId, Bundle bundle) {
        return null;
    }

  
}
