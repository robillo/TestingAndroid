package com.appbusters.robinkamboj.androidtesting;

import android.support.test.espresso.idling.CountingIdlingResource;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FourActivity extends AppCompatActivity {

    CountingIdlingResource idlingResource = new CountingIdlingResource("ON_RESUME_IDLING_RES");
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);

        textView = (TextView) findViewById(R.id.text_four_activity);
    }

    @Override
    protected void onResume() {
        super.onResume();
        idlingResource.increment();
        new Thread(new Runnable() {
            @Override
            public void run() {
                try{
                    Thread.sleep(5000);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        textView.setText(R.string.onresumetext);
                        idlingResource.decrement();
                    }
                });
            }
        }).start();
    }
}
