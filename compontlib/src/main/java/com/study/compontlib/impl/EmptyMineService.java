package com.study.compontlib.impl;

import android.content.Context;

import com.study.compontlib.service.IMineServee;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
 */

/**
 * 定义空 Service  实现，防止主工程调用空指针
 */
public class EmptyMineService implements IMineServee {
    @Override
    public void launch(Context context, int userId) {

    }
}
