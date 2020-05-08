package edu.depaul.se433.shopping;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class TaxCalculatorTest {

  @Test
  @DisplayName("simple single item tax")
  void testSimpleItemTax() {
    Item item = new Item("socks",5.0, 3, "IL");
    double expected = (5.0 * 3) * 1.06;
    double tax = TaxCalculator.tax(item);

    assertEquals(expected, tax);
  }

}
