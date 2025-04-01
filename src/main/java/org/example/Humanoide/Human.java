package org.example.Humanoide;

public class Human extends Humanoide implements Behavior {

  public Human(String name, int age, String gender, int hp, int mp) {
    super(name, age, gender, hp, mp);
  }

  public String getName() {
    return name;
  }

  @Override
  public String speak() {
    return "the Best";
  }

  @Override
  public String drink() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'drink'");
  }

  @Override
  public String escape() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'escape'");
  }

  @Override
  public String eat() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'eat'");
  }
}
