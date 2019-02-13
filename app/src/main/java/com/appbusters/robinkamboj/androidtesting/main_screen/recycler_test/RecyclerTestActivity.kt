package com.appbusters.robinkamboj.androidtesting.main_screen.recycler_test

import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

import com.appbusters.robinkamboj.androidtesting.main_screen.recycler_test.model.Data
import com.appbusters.robinkamboj.androidtesting.R
import com.appbusters.robinkamboj.androidtesting.main_screen.recycler_test.adapter.RvAdapter
import kotlinx.android.synthetic.main.activity_recycler_test.*

import java.util.ArrayList

class RecyclerTestActivity : AppCompatActivity() {

    internal var list: MutableList<Data> = ArrayList()
    internal lateinit var adapter: RvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_test)

        for (i in 0..29)
            list.add(Data("TEXT 1: $i", "TEXT 2: $i"))

        adapter = RvAdapter(list)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter
    }

    companion object {

        fun newIntent(context: Context): Intent {
            return Intent(context, RecyclerTestActivity::class.java)
        }
    }
}
