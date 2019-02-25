package com.study.modularization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;

import com.study.compontlib.ServiceFactory;

public class MainActivity extends AppCompatActivity {

    private FrameLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        container = findViewById(R.id.container);
    }

    public void toLogin(View view) {
        if (ServiceFactory.getInstance().getmLoginService() != null){
            ServiceFactory.getInstance().getmLoginService().launch(MainActivity.this,"");
        }
    }

    public void toMine(View view) {
        ServiceFactory.getInstance().getmMineService().launch(MainActivity.this,222);
    }

    public void ShowUI(View view) {
        Bundle bundle = new Bundle();
        ServiceFactory.getInstance().getmLoginService().newUuserInfoFragment(
                getSupportFragmentManager(),R.id.container,bundle);
    }
}
