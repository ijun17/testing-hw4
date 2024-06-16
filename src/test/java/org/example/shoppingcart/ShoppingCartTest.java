package org.example.shoppingcart;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    @Test
    public void test(){
        ShoppingCart cart = new ShoppingCart();
        for(int i=1; i<5; i++){
            cart.add(new Item("a", ItemType.OTHER, 1,i));
        }
        int count = cart.numberOfItems();
        assertThat(count).isEqualTo(10);
    }
}