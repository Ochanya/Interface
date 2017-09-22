package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Army firstArmy = new Army("John", "Sergent", 123);

        Marine firstMarine = new Marine("Jess", "Admiral", 456 );

        System.out.println(firstArmy.name +  " " +  firstArmy.gun() + " and annihilate  " + firstArmy.Grenade() +  " " + firstArmy.speak());

        System.out.println(firstMarine.name  + " Fight!: " +  firstMarine.Boot() + " "+ firstMarine.hand() + " " + firstMarine.speak());
    }
}
