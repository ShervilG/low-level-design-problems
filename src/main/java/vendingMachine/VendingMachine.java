package main.java.vendingMachine;

/*
A code to implement a Vending machine that has a bunch of products like
chocolates, candy, cold-drink, and accept some coins.
On inserting a coin, get a product back, and get the change back.
Unit test to demonstrate that these common use cases work.
*/

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

  private List<Items> availableItems;

  private int totalChange;

  private boolean isFunctional = false;

  public VendingMachine() {
    this.totalChange = 0;
    this.isFunctional = true;
    this.availableItems = new ArrayList<>();
  }

  public VendingMachine(List<Items> itemsList, int totalChange) {
    this.totalChange = totalChange;
    this.isFunctional = true;
    this.availableItems = itemsList;
  }

  public boolean working() {
    return this.isFunctional;
  }

  public void setWorking(boolean working) {
    this.isFunctional = working;
  }
}
