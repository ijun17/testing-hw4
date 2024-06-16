package org.example.shoppingcart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items;
    public ShoppingCart(){
        this.items = new ArrayList<>();
    }
    public void add(Item item){
        this.items.add(item);
    }
    public int numberOfItems(){
        int count = 0;
        for(Item item : this.items){
            count += item.getCount();
        }
        return count;
    }
    public List<Item> getItems(){
        return this.items;
    }
}
