package edu.depaul.se433.shopping;

public class TaxCalculator {

  public static double tax(Item item) {
    double tax = item.value() * 1.06;
    return tax;
  }

}
