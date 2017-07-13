package com.appbusters.robinkamboj.androidtesting;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class RvHolder extends RecyclerView.ViewHolder{

    public TextView text1, text2;

    public RvHolder(View itemView) {
        super(itemView);
        text1 = (TextView) itemView.findViewById(R.id.text1);
        text2 = (TextView) itemView.findViewById(R.id.text2);
    }
}
