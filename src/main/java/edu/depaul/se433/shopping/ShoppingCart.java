package edu.depaul.se433.shopping;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class ShoppingCart {

  private Map<String, Item> items = new HashMap<>();

  public void add(Item item) {
    items.put(item.getName(), item);
  }

  public Item get(String name) {
    return items.get(name);
  }

  public double value() {
    double value = 0.0;
    for (Entry<String, Item> entry : items.entrySet()) {
      value += entry.getValue().value();
    }
    return value;
  }
}
