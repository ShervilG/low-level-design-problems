package main.java.splitwsise.entities;

import main.java.splitwsise.Common;
import java.util.HashMap;
import java.util.Map;

public class User {

  private final Long userId;

  private Map<Long, Float> debt;

  public User() {
    this.userId = Common.sequence++;
    this.debt = new HashMap<>();
  }

  public Long getUserId() {
    return userId;
  }

  public Map<Long, Float> getDebt() {
    return debt;
  }

}
