package org.example.Race;

public class Human extends Humanoide implements Behavior {

  public Human(String name, int age, String gender, int hp, int mp) {
    super(name, age, gender, hp, mp);
  }

  public String getName() {
    return name;
  }

  @Override
  public String speak(String name) {
    return "I am a human my name is " + name;
  }

  @Override
  public String drink() {
   return  "Drink human potion";
  }

  @Override
  public String escape() {
    return null;
  }

  @Override
  public String eat() {
    return null;


  }
}
