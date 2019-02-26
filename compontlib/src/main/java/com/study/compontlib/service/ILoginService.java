package com.study.compontlib.service;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
 */


/**
 * 这里主要是暴露自己的方法给其他组件，所有需要交互的组件都需要在 compontlib 中定义
 */
public interface ILoginService {
    void launch(Context context,String targetClass);

    Fragment newUuserInfoFragment(android.support.v4.app.FragmentManager fragmentManager, int viewId, Bundle bundle);



}
