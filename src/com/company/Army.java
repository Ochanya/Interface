package com.company;
public class Army extends Soldier implements WeaponPlusCombat{

  public Army(String name, String rank, int serialNumber) {
    super(name, rank, serialNumber);
  }

  Bomb grenade = new Bomb();
  String speak() {
    return "HOOAH!";
  }


  @Override
  public Bomb Grenade() {
    return  grenade;
  }

  @Override
  public String gun() {
    return "Shoot!";
  }

  @Override
  public String knife() {
    return "Stab";
  }
}
