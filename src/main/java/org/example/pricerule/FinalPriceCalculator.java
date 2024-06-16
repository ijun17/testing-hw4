package org.example.pricerule;

import org.example.shoppingcart.ShoppingCart;

import java.util.List;

public class FinalPriceCalculator {
    private final List<PriceRule> rules;
    public FinalPriceCalculator(List<PriceRule> rules){
        this.rules = rules;
    }
    public double calculate(ShoppingCart cart){
        double finalPrice = 0;
        for(PriceRule rule:this.rules){
            finalPrice += rule.priceToAggregate(cart);
        }
        return finalPrice;
    }
}
