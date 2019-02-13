package com.appbusters.robinkamboj.androidtesting.main_screen.async_task_test;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.appbusters.robinkamboj.androidtesting.R;

public class AsyncTaskTestActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_async_task_test);

        textView = findViewById(R.id.text_three_activity);
    }

    @SuppressLint("StaticFieldLeak")
    @Override
    protected void onResume() {
        super.onResume();
        new AsyncTask<Void, Void, Void>(){

            @Override
            protected Void doInBackground(Void... voids) {
                try{
                    Thread.sleep(5000);
                }
                catch (Exception e){
                    e.printStackTrace();
                }
                return null;
            }

            @Override
            protected void onPostExecute(Void aVoid) {
                super.onPostExecute(aVoid);
                textView.setText(R.string.onresumetext);
            }
        }.execute();
    }
}
