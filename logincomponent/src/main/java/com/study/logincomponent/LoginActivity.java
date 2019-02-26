package com.study.logincomponent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.study.compontlib.ServiceFactory;

public class LoginActivity extends AppCompatActivity {

    public static final String EXTRA_TRAGET_CLASS = "EXTRA_TARGET_CLASS";

    Button login_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("Modularization", "login onCreate: ");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity_main);
        login_main = findViewById(R.id.login_main);

        login_main.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServiceFactory.getInstance().getmMineService().launch(LoginActivity.this,123);
            }
        });
    }
}
