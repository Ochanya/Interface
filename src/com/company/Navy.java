package com.company;

public class Navy extends Soldier implements WeaponPlusCombat{

  public Navy(String name, String rank, int serialNumber) {
    super(name, rank, serialNumber);
  }

  @Override
  String speak() {
    return "HOOYAH!";
  }

  @Override
  public Bomb Grenade() {
    return null;
  }

  @Override
  public String gun() {
    return "Shoot";
  }

  @Override
  public String knife() {
    return "Stab";
  }
}
