package com.company;

interface PhysicalCombat {
  public String legs();
  public String hand();
  public String head();
  public default String Boot(){
    return "Stamp";
  };
}
