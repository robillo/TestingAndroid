package com.appbusters.robinkamboj.androidtesting.main_screen;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.appbusters.robinkamboj.androidtesting.main_screen.thread_test.ThreadTestActivity;
import com.appbusters.robinkamboj.androidtesting.main_screen.text_test.TextTestActivity;
import com.appbusters.robinkamboj.androidtesting.R;
import com.appbusters.robinkamboj.androidtesting.main_screen.async_task_test.AsyncTaskTestActivity;
import com.appbusters.robinkamboj.androidtesting.main_screen.recycler_test.RecyclerTestActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.text_test_button:{
                startActivity(new Intent(this, TextTestActivity.class));
                break;
            }
            case R.id.recycler_test_button:{
                startActivity(new Intent(this, RecyclerTestActivity.class));
                break;
            }
            case R.id.async_task_test_button:{
                startActivity(new Intent(this, AsyncTaskTestActivity.class));
                break;
            }
            case R.id.thread_test_button:{
                startActivity(new Intent(this, ThreadTestActivity.class));
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
