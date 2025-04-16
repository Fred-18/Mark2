package org.example.Race;

import Cast.Weapons;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {



    Human a = new Human("fred",12,"M",500,0,200,300,20);
    Human b = new Human("dodo",12,"M",500,0,200,300,20);

    System.out.println(b.getHealthPoint());
    a.bigAttack(b,a.getAttackPoint());
    System.out.println(a.getAttackPoint());
    System.out.println(b.getHealthPoint());


  }
}
