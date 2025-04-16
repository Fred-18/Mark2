package org.example.Race;

import Cast.Weapons;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    HashMap<String, Integer> ages = new HashMap<String, Integer>();
    ages.put("David", 22);
    ages.put("Tom", 23);
    ages.put("Robert", 32);
    ages.put("Alice", 21);
    ages.put("Sophie", 19);
    ages.put("Maria", 24);
    ages.put("John", 28);

    ArrayList<Integer> nums = new ArrayList<Integer>();
    nums.add(1);
    nums.add(2);
    nums.add(3);
    nums.add(5);
    nums.add(6);
    nums.add(7);
    int max = Collections.max(nums);
    int  min= Collections.min(nums);
    System.out.println(max);
    System.out.println(min);



    ArrayList<Integer> l = new ArrayList<Integer>();
    for (int i = 0; i < 6; i++) {
      l.add(i);

    }
    System.out.println(l);
    int x = 0;
    Iterator<Integer> it = l.iterator();
    while (it.hasNext()) {
      x+= it.next();
    }
    System.out.println(x);

    Human a = new Human("fred",12,"M",500,0,200,300,20);
    Human b = new Human("dodo",12,"M",500,0,200,300,20);

    System.out.println(b.getHealthPoint());
    a.bigAttack(b,a.getAttackPoint());
    System.out.println(a.getAttackPoint());
    System.out.println(b.getHealthPoint());


    String[] nameArr = new String[ages.size()];
    nameArr = ages.keySet().toArray(nameArr);

    System.out.println(ages.keySet());

    int ageLimit = scanner.nextInt();

    for (String emp : nameArr){
      if(ages.get(emp) > ageLimit){
        ages.remove(emp);
      }
    }

    System.out.println(ages);

  }
}
