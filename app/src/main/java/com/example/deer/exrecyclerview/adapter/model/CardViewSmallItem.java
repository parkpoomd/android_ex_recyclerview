package com.example.deer.exrecyclerview.adapter.model;

import com.example.deer.exrecyclerview.adapter.ViewType;

public class CardViewSmallItem extends BaseItem {

    private int cardViewImage;
    private String cardViewText;

    public CardViewSmallItem() {
        super(ViewType.TYPE_CARD_VIEW_SMALL);
    }

    public int getImage() {
        return cardViewImage;
    }

    public CardViewSmallItem setImage(int cardViewImage) {
        this.cardViewImage = cardViewImage;
        return this;
    }

    public String getText() {
        return cardViewText;
    }

    public CardViewSmallItem setText(String cardViewText) {
        this.cardViewText = cardViewText;
        return this;
    }
}
