package edu.depaul.se433.shopping;

/**
 * Represents a purchasable item in a ShoppingCart
 */
public class Item {

  private int quantity;
  private double unitPrice;
  private String name;

  public String getState() {
    return state;
  }

  private String state;

  public Item(String name, double unitPrice, int quantity, String state) {
    this.quantity = quantity;
    this.unitPrice = unitPrice;
    this.name = name;
    this.state = state;
  }

  public double value() {
    return unitPrice * quantity;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getUnitPrice() {
    return unitPrice;
  }

  public void setUnitPrice(double unitPrice) {
    this.unitPrice = unitPrice;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }

}
