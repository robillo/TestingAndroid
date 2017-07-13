package com.appbusters.robinkamboj.androidtesting;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class TwoActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Data> list = new ArrayList<>();
    RvAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

        recyclerView = (RecyclerView) findViewById(R.id.recycler);
        for(int i=0; i<30; i++){
            list.add(new Data("TEXT 1: " + i, "TEXT 2: " + i));
        }
        adapter = new RvAdapter(list, getApplicationContext());
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}
