package org.example.shoppingcart;


public class Item {
    String name;
    ItemType type;
    double price;
    int count;
    public Item(String name, ItemType type, double price, int count){
        this.name = name;
        this.type = type;
        this.price = price;
        this.count = count;
    }
    public ItemType getType(){
        return this.type;
    }
    public int getCount(){
        return this.count;
    }
}

