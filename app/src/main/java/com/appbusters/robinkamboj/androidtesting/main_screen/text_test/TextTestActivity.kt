package com.appbusters.robinkamboj.androidtesting.main_screen.text_test

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

import com.appbusters.robinkamboj.androidtesting.R
import com.appbusters.robinkamboj.androidtesting.main_screen.MainActivity
import kotlinx.android.synthetic.main.activity_text_test.*

class TextTestActivity : AppCompatActivity() {

    companion object {

        private const val TEXT_TO_TYPE = "ROBIN"

        fun newIntent(context: Context): Intent {
            return Intent(context, TextTestActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_test)
    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.main_activity_navigate_button -> {
                startActivity(MainActivity.newIntent(this))
            }
            R.id.verify_valid_text -> {
                if(type_text.text.toString() == TEXT_TO_TYPE) {
                    verified_text.visibility = View.VISIBLE
                    verified_text.setText(R.string.text_verified)
                }
            }
        }
    }
}
