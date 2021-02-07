package main.java.splitwsise;

import main.java.splitwsise.entities.User;
import main.java.splitwsise.services.UserService;

import java.util.ArrayList;
import java.util.List;

public class Runner {

  static private UserService userService;

  public static void main(String[] args) {
    userService = new UserService();
    List<User> userList = new ArrayList<>();

    // create users
    for(int i = 0; i < 3;i++) {
      userList.add(userService.createUser());
    }


  }
}
