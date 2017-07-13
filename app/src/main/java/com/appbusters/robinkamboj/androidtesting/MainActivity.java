package com.appbusters.robinkamboj.androidtesting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.one:{
                startActivity(new Intent(this, OneActivity.class));
                break;
            }
            case R.id.two:{
                startActivity(new Intent(this, TwoActivity.class));
                break;
            }
            case R.id.three:{

                break;
            }
            case R.id.four:{

                break;
            }
            case R.id.five:{

                break;
            }
            case R.id.six:{

                break;
            }
        }
    }
}
