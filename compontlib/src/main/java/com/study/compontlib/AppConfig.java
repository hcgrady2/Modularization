package com.study.compontlib;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
 */

/**
 * 通过反射实例化每个 Module 中的 application
 */
public class AppConfig {
    public static final String[] CONPONENTS = {
            "com.study.logincomponent.LoginApp",
            "com.study.minecomponent.MineApp"
    };
}
