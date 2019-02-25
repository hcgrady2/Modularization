package com.study.minecomponent.services;

import android.content.Context;
import android.content.Intent;

import com.study.compontlib.service.IMineServee;
import com.study.minecomponent.MineActivity;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
 */

public class MineService implements IMineServee{


    @Override
    public void launch(Context context, int userId) {
        Intent intent = new Intent(context, MineActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        intent.putExtra("ID",userId);
        context.startActivity(intent);

    }
}
