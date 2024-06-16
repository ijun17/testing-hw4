package org.example;

import org.example.pricerule.DeliveryPrice;
import org.example.pricerule.ExtraChargeForElectronics;
import org.example.pricerule.FinalPriceCalculator;
import org.example.pricerule.PriceRule;
import org.example.shoppingcart.Item;
import org.example.shoppingcart.ItemType;
import org.example.shoppingcart.ShoppingCart;

import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add(new Item("a", ItemType.OTHER, 1, 2));
        cart.add(new Item("b", ItemType.ELECTRONIC, 1, 1));
        cart.add(new Item("c", ItemType.OTHER, 1, 3));

        List<PriceRule> rules = new ArrayList<>();
        rules.add(new DeliveryPrice());
        rules.add(new ExtraChargeForElectronics());
        FinalPriceCalculator cal = new FinalPriceCalculator(rules);

        System.out.println("price: "+cal.calculate(cart));

    }
}