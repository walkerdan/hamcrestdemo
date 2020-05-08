package edu.depaul.se433.shopping;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

  @Test
  @DisplayName("Should be able to add an item to a cart")
  void testAddItem() {
    ShoppingCart cart = new ShoppingCart();
    Item item = new Item("socks", 5.0, 2, "IL");
    cart.add(item);
    assertEquals(item, cart.get("socks"));
  }

  @Test
  @DisplayName("should total items in the cart")
  void testTotalItems() {
    ShoppingCart cart = new ShoppingCart();
    Item item = new Item("socks", 5.0, 2, "IL");
    cart.add(item);
    item = new Item("built", 25.0, 1, "IL");
    cart.add(item);
    assertEquals(35.0, cart.value(), 0.001);
  }

}
