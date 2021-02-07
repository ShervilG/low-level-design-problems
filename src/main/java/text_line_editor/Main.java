package main.java.text_line_editor;

import main.java.text_line_editor.models.Editor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws Exception {
    Editor editor = new Editor(2);
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
      System.out.println("1. Append line");
      System.out.println("2. Print data");
      String command = bufferedReader.readLine();
      if(command.equalsIgnoreCase("1")) {
        System.out.print("Enter line : ");
        String input = bufferedReader.readLine();
        editor.appendLine(input);
      } else if(command.equalsIgnoreCase("2")) {
        editor.printLines();
      } else {
        System.out.println("Invalid Command !!!");
      }
    }
  }
}
