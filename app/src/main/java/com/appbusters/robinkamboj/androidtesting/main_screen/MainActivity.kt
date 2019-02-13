package com.appbusters.robinkamboj.androidtesting.main_screen

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.appbusters.robinkamboj.androidtesting.main_screen.thread_test.ThreadTestActivity
import com.appbusters.robinkamboj.androidtesting.main_screen.text_test.TextTestActivity
import com.appbusters.robinkamboj.androidtesting.R
import com.appbusters.robinkamboj.androidtesting.main_screen.async_task_test.AsyncTaskTestActivity
import com.appbusters.robinkamboj.androidtesting.main_screen.recycler_test.RecyclerTestActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(v: View) {
        when (v.id) {
            R.id.text_test_button -> {
                startActivity(TextTestActivity.newIntent(this))
            }
            R.id.recycler_test_button -> {
                startActivity(RecyclerTestActivity.newIntent(this))
            }
            R.id.async_task_test_button -> {
                startActivity(AsyncTaskTestActivity.newIntent(this))
            }
            R.id.thread_test_button -> {
                startActivity(ThreadTestActivity.newIntent(this))
            }
            R.id.five, R.id.six -> { }
        }
    }

    companion object {

        fun newIntent(context: Context): Intent {
            return Intent(context, MainActivity::class.java)
        }
    }
}
