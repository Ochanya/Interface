package com.company;

abstract class Soldier {
  public String name;
  public String rank;
  public int serialNumber;

  public Soldier(String name, String rank, int serialNumber) {
    this.name = name;
    this.rank = rank;
    this.serialNumber = serialNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getRank() {
    return rank;
  }

  public void setRank(String rank) {
    this.rank = rank;
  }

  public int getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(int serialNumber) {
    this.serialNumber = serialNumber;
  }

  public String sleep(){
    return "snore";
  }

  public String eat(){
    return "nom nom";
  }

  public String walk(){
    return "trudge";
  }

  abstract String speak();


}
