package edu.depaul.se433.shopping;

public class Item {

  private int quantity;
  private double unitPrice;
  private String name;

  public Item(String name, double unitPrice, int quantity) {
    this.quantity = quantity;
    this.unitPrice = unitPrice;
    this.name = name;
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
