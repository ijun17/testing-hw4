package org.example.pricerule;

import org.example.shoppingcart.Item;
import org.example.shoppingcart.ItemType;
import org.example.shoppingcart.ShoppingCart;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class DeliveryPriceTest {
    @ParameterizedTest
    @CsvSource({"0,0","1,5","3,5","4,12.5","10,12.5","11,20"})
    void test(int itemCount, double expectedPrice){
        ShoppingCart cart = new ShoppingCart();

        for(int i=0; i<itemCount; i++){
            cart.add(new Item("name", ItemType.OTHER, 1,1));
        }

        double price = new DeliveryPrice().priceToAggregate(cart);

        assertThat(price).isEqualTo(expectedPrice);
    }
}