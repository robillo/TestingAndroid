package com.appbusters.robinkamboj.androidtesting.main_screen.text_test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.appbusters.robinkamboj.androidtesting.R;
import com.appbusters.robinkamboj.androidtesting.main_screen.MainActivity;

public class TextTestActivity extends AppCompatActivity {

    private TextView verifiedText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_test);

        verifiedText = findViewById(R.id.verified_text);
    }

    public void onClick(View view) {
        switch (view.getId()){
            case R.id.main_activity_navigate_button: {
                startActivity(new Intent(this, MainActivity.class));
                break;
            }
            case R.id.verify_valid_text: {
                verifiedText.setVisibility(View.VISIBLE);
                verifiedText.setText(R.string.text_verified);
                break;
            }
        }
    }
}
