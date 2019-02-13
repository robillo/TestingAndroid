package com.appbusters.robinkamboj.androidtesting.main_screen.thread_test

import android.content.Context
import android.content.Intent
import android.support.test.espresso.idling.CountingIdlingResource
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import com.appbusters.robinkamboj.androidtesting.R

class ThreadTestActivity : AppCompatActivity() {

    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread_test)

        textView = findViewById(R.id.text_four_activity)
    }

    override fun onResume() {
        super.onResume()
        idlingResourceInTest.increment()
        Thread(Runnable {
            try {
                Thread.sleep(5000)
            } catch (e: InterruptedException) {
                e.printStackTrace()
            }

            runOnUiThread {
                textView.setText(R.string.thread_resume_text)
                idlingResourceInTest.decrement()
            }
        }).start()
    }

    companion object {
        private const val IDLING_RESOURCE_NAME = "ON_RESUME_IDLING_RES"
        val idlingResourceInTest = CountingIdlingResource(IDLING_RESOURCE_NAME)

        fun newIntent(context: Context): Intent {
            return Intent(context, ThreadTestActivity::class.java)
        }
    }
}
