package com.example.deer.exrecyclerview.utility;

import com.example.deer.exrecyclerview.adapter.model.CardViewItem;
import com.example.deer.exrecyclerview.adapter.model.CardViewSmallItem;

public class Converter {

    public static CardViewItem createCardViewItem(int cardViewImage, String cardViewText) {
        CardViewItem cardViewItem = new CardViewItem();
        cardViewItem.setImage(cardViewImage);
        cardViewItem.setText(cardViewText);
        return cardViewItem;
    }

    public static CardViewSmallItem createCardViewSmallItem(int cardViewSmallImage, String cardViewSmallText) {
        CardViewSmallItem cardViewSmallItem = new CardViewSmallItem();
        cardViewSmallItem.setImage(cardViewSmallImage);
        cardViewSmallItem.setText(cardViewSmallText);
        return cardViewSmallItem;
    }
}
