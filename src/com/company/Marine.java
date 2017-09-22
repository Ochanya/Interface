package com.company;

public class Marine extends Soldier implements PhysicalCombat{

  public Marine(String name, String rank, int serialNumber) {
    super(name, rank, serialNumber);
  }

  @Override
  String speak() {
    return "OOHRAH!";
  }

  @Override
  public String Boot() {
    return "Stomp!";
  }

  @Override
  public String legs() {
    return "Drop-Kick";
  }

  @Override
  public String hand() {
    return "Punch!";
  }

  @Override
  public String head() {
    return "Head-butt";
  }
}
