package com.appbusters.robinkamboj.androidtesting;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvHolder>{

    private List<Data> datas;
    private Context context;

    public RvAdapter(List<Data> datas, Context context) {
        this.datas = datas;
        this.context = context;
    }

    @Override
    public RvHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new RvHolder(v);
    }

    @Override
    public void onBindViewHolder(RvHolder holder, int position) {
        holder.text1.setText(datas.get(position).getText1());
        holder.text2.setText(datas.get(position).getText2());
    }

    @Override
    public int getItemCount() {
        return datas.size();
    }
}
