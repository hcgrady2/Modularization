package com.study.compontlib.impl;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;

import com.study.compontlib.service.ILoginService;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
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
