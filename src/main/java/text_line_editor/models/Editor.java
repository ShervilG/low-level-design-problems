package main.java.text_line_editor.models;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Editor {

  private Map<Integer, String> lines;

  private List<String> commandHistory;

  private final int commandHistoryCapacity;

  public Editor() {
    this.commandHistory = new LinkedList<>();
    this.commandHistoryCapacity = 1;
    this.lines = new TreeMap<>();
  }

  public Editor(int capacity) {
    this.commandHistory = new LinkedList<>();
    this.commandHistoryCapacity = capacity;
    this.lines = new TreeMap<>();
  }

  public void addCommandToHistoryList(String command) {
    if(this.commandHistory.size() == this.commandHistoryCapacity) {
      commandHistory.remove(0);
    }
    commandHistory.add(command);
  }

  public void printLines() {
    for(Map.Entry<Integer, String> e: this.lines.entrySet()) {
      System.out.println(e.getValue());
    }
  }

  public void appendLine(String line) {
    lines.put(lines.size(), line);
  }
}
