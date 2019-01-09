package com.example.deer.exrecyclerview.adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.deer.exrecyclerview.adapter.model.BaseItem;
import com.example.deer.exrecyclerview.adapter.holder.BaseViewHolder;
import com.example.deer.exrecyclerview.adapter.holder.CardViewHolder;
import com.example.deer.exrecyclerview.adapter.model.CardViewItem;
import com.example.deer.exrecyclerview.adapter.holder.CardViewSmallHolder;
import com.example.deer.exrecyclerview.adapter.model.CardViewSmallItem;
import com.example.deer.exrecyclerview.R;

import java.util.ArrayList;
import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<BaseViewHolder> {

    private List<BaseItem> itemList;

    public MainAdapter() {
        itemList = new ArrayList<>();
    }

    public void setItemList(List<BaseItem> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public BaseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == ViewType.TYPE_CARD_VIEW) {
            View view = LayoutInflater
                    .from(parent.getContext())
                    .inflate(R.layout.list_item, parent, false);
            return new CardViewHolder(view);

        } else if (viewType == ViewType.TYPE_CARD_VIEW_SMALL) {
            View view = LayoutInflater
                    .from(parent.getContext())
                    .inflate(R.layout.list_small_item, parent, false);
            return new CardViewSmallHolder(view);
        }

        throw new NullPointerException("View Type " + viewType + " doesn't match with any existing type");
    }

    @Override
    public void onBindViewHolder(@NonNull BaseViewHolder holder, int position) {
        BaseItem item = itemList.get(position);
        if (holder instanceof CardViewHolder) {
            CardViewHolder cardViewHolder = (CardViewHolder) holder;
            CardViewItem cardViewItem = (CardViewItem) item;
            setupCardView(cardViewHolder, cardViewItem);

        } else if (holder instanceof CardViewSmallHolder) {
            CardViewSmallHolder cardViewSmallHolder = (CardViewSmallHolder) holder;
            CardViewSmallItem cardViewSmallItem = (CardViewSmallItem) item;
            setupCardViewSmall(cardViewSmallHolder, cardViewSmallItem);

        }
    }

    private void setupCardView(CardViewHolder cardViewHolder, CardViewItem cardViewItem) {
        cardViewHolder.imageView.setImageResource(cardViewItem.getImage());
        cardViewHolder.textView.setText(cardViewItem.getText());
    }

    private void setupCardViewSmall(CardViewSmallHolder cardViewSmallHolder, CardViewSmallItem cardViewSmallItem) {
        cardViewSmallHolder.imageView.setImageResource(cardViewSmallItem.getImage());
        cardViewSmallHolder.textView.setText(cardViewSmallItem.getText());
    }

    @Override
    public int getItemViewType(int position) {
        return itemList.get(position).getType();
    }

    @Override
    public int getItemCount() {
        if (!itemList.isEmpty() || itemList != null) {
            return itemList.size();
        }
        return 0;
    }
}
