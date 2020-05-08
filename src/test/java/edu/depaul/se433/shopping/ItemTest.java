package edu.depaul.se433.shopping;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ItemTest {

  @Test
  @DisplayName("should calculate the value of the item based on unit price and quantity")
  void shouldCalcValue() {

    Item item = new Item("apples", 0.59, 10, "IL");
    assertEquals(5.9, item.value(), 0.001);

  }

}
