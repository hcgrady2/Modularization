package com.study.compontlib.service;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
 */

public interface ILoginService {
    void launch(Context context,String targetClass);

    Fragment newUuserInfoFragment(android.support.v4.app.FragmentManager fragmentManager, int viewId, Bundle bundle);



}
