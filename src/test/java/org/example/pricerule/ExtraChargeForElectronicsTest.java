package org.example.pricerule;

import org.example.shoppingcart.Item;
import org.example.shoppingcart.ItemType;
import org.example.shoppingcart.ShoppingCart;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExtraChargeForElectronicsTest {
    @ParameterizedTest
    @CsvSource({"0,1","0,2","1,1","1,2"})
    public void test(int otherCount, int elecCount){
        ShoppingCart cart = new ShoppingCart();
        for(int i=0; i<otherCount; i++)cart.add(new Item("a", ItemType.OTHER,1,1));
        for(int i=0; i<elecCount; i++)cart.add(new Item("a", ItemType.ELECTRONIC, 1, 1));

        double price = new ExtraChargeForElectronics().priceToAggregate(cart);

        assertThat(price).isEqualTo(7.50);
    }

    @Test
    public void test2(){
        ShoppingCart cart = new ShoppingCart();
        for(int i=0; i<4; i++)cart.add(new Item("a", ItemType.OTHER,1,1));
        double price = new ExtraChargeForElectronics().priceToAggregate(cart);
        assertThat(price).isEqualTo(0);
    }
}