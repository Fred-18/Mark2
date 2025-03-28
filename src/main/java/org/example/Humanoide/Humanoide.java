package org.example.Humanoide;

public abstract class Humanoide {

  protected String name;
  protected int age;
  protected String gender;
  protected int hp;
  protected int mp = 0;

  public Humanoide() {}

  public Humanoide(String name, int age, String gender, int hp, int mp) {
    this.name = name;
    this.age = age;
    this.gender = gender;
    this.hp = hp;
    this.mp = mp;
  }
}
