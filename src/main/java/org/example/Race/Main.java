package org.example.Race;

import Cast.Warrior;
import Cast.Weapons;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    Human humain = new Human("fred", 24, "M", 100, 0);
    Warrior k = new Warrior(0,500, Weapons.AXE);



    System.out.println(k.getShield());
    System.out.println(k.setShield(0));
    System.out.println(humain.speak(humain.name));
    System.out.println(humain.getName());
    System.out.println(humain.drink());
  }
}
