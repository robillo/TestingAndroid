package com.appbusters.robinkamboj.androidtesting.main_screen.async_task_test

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.AsyncTask
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

import com.appbusters.robinkamboj.androidtesting.R

class AsyncTaskTestActivity : AppCompatActivity() {

    internal lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_async_task_test)

        textView = findViewById(R.id.text_three_activity)
    }

    @SuppressLint("StaticFieldLeak")
    override fun onResume() {
        super.onResume()
        object : AsyncTask<Void, Void, Void?>() {

            override fun doInBackground(vararg voids: Void): Void? {
                try {
                    Thread.sleep(5000)
                } catch (e: Exception) {
                    e.printStackTrace()
                }

                return null
            }

            override fun onPostExecute(aVoid: Void?) {
                super.onPostExecute(aVoid)
                textView.setText(R.string.thread_resume_text)
            }
        }.execute()
    }

    companion object {

        fun newIntent(context: Context): Intent {
            return Intent(context, AsyncTaskTestActivity::class.java)
        }
    }
}
