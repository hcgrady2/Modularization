package com.study.minecomponent;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MineActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (getIntent() != null){
            int id = getIntent().getIntExtra("ID",1);
            Toast.makeText(this,":"+id,Toast.LENGTH_SHORT).show();
        }
    }
}
