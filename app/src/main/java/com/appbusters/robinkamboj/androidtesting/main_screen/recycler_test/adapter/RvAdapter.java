package com.appbusters.robinkamboj.androidtesting.main_screen.recycler_test.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.appbusters.robinkamboj.androidtesting.main_screen.recycler_test.model.Data;
import com.appbusters.robinkamboj.androidtesting.R;

import org.jetbrains.annotations.NotNull;

import java.util.List;

public class RvAdapter extends RecyclerView.Adapter<RvAdapter.RvHolder>{

    private List<Data> data;

    public RvAdapter(List<Data> data) {
        this.data = data;
    }

    @NotNull
    @Override
    public RvHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout, parent, false);
        return new RvHolder(v);
    }

    @Override
    public void onBindViewHolder(@NotNull RvHolder holder, int position) {
        holder.textLeft.setText(data.get(position).getTextLeft());
        holder.textRight.setText(data.get(position).getTextRight());
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class RvHolder extends RecyclerView.ViewHolder {

        TextView textLeft, textRight;

        RvHolder(View itemView) {
            super(itemView);
            textLeft = itemView.findViewById(R.id.textLeft);
            textRight = itemView.findViewById(R.id.textRight);
        }
    }
}
