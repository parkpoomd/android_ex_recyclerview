package com.example.deer.exrecyclerview.adapter.holder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.deer.exrecyclerview.R;

public class CardViewHolder extends BaseViewHolder {
    public ImageView imageView;
    public TextView textView;

    public CardViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
        textView = (TextView) itemView.findViewById(R.id.textView);
    }
}
