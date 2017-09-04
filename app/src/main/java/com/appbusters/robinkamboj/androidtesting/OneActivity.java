package com.appbusters.robinkamboj.androidtesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OneActivity extends AppCompatActivity {

    //OneActivity

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.visible_one_activity:{
                startActivity(new Intent(this, MainActivity.class));
                break;
            }
        }
    }
}
