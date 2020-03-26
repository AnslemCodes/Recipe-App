package com.example.recipeapp;

public class FoodData {
    private String ItemName;
    private String ItemDescription;
    private String ItemPrice;
    private int ItemImage;

    public FoodData(String itemName, String itemDescription, String itemPrice, int itemImage) {
        ItemName = itemName;
        ItemDescription = itemDescription;
        ItemPrice = itemPrice;
        ItemImage = itemImage;
    }

    public String getItemName() {
        return ItemName;
    }

    public String getItemDescription() {
        return ItemDescription;
    }

    public String getItemPrice() {
        return ItemPrice;
    }

    public int getItemImage() {
        return ItemImage;
    }
}
