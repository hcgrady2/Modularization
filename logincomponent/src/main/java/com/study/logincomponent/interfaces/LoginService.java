package com.study.logincomponent.interfaces;

import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;

import com.study.compontlib.service.ILoginService;
import com.study.logincomponent.LoginActivity;
import com.study.logincomponent.UserInfoFragment;

/**
 * Created by hcw on 2019/2/25.
 * Copyright©hcw.All rights reserved.
 */


/**
 * LoginService 主要是实现定义好的交互的接口里面的方法
 */
public class LoginService implements ILoginService{

    @Override
    public void launch(Context context, String targetClass) {
        Log.i("Modularization", "launch: target");
        Intent intent = new Intent(context, LoginActivity.class);
        //intent.putExtra(LoginActivity.EXTRA_TRAGET_CLASS,targetClass);
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    @Override
    public Fragment newUuserInfoFragment(android.support.v4.app.FragmentManager fragmentManager, int viewId, Bundle bundle) {
        UserInfoFragment fragment = new UserInfoFragment();
        fragment.setArguments(bundle);
        fragmentManager.beginTransaction().add(viewId,fragment).commit();
        return fragment;
    }

}
