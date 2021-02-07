package main.java.splitwsise.entities;

import main.java.splitwsise.Common;

import java.util.Date;

public class Transaction {

  private Long id;

  private Date createdAt;

  private User user;

  public Transaction(User user) {
    this.id = Common.sequence++;
    this.createdAt = new Date(System.currentTimeMillis());
    this.user = user;
  }

}
