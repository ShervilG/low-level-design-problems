package main.java.vendingMachine;

public class Items {

  private int id;

  private String name;

  private int qty;

  private int price;

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public int getPrice() {
    return price;
  }

  public int getQty() {
    return qty;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setId(int id) {
    this.id = id;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  public void setQty(int qty) {
    this.qty = qty;
  }
}
