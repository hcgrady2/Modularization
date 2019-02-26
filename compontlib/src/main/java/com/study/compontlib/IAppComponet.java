package com.study.compontlib;

import android.app.Application;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
 */

/**
 * 通用初始化，接口，当组件是独立运行时，application 为组件 app,当组件为lib 时，通过反射初始化 application 是主工程 app
 */
public interface IAppComponet {
    void initialize(Application application);
}
