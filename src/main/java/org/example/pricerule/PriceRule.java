package org.example.pricerule;

import org.example.shoppingcart.ShoppingCart;


public interface PriceRule {
    double priceToAggregate(ShoppingCart cart);
}
