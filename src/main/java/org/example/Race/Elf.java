package org.example.Race;

public class Elf extends Humanoide implements Behavior {

    public Elf(String name, int age, String gender, int hp, int mp) {
        //super(name, age, gender, hp, mp);
    }

    @Override
    public String speak(String name) {
        return "I am Elf";
    }

    @Override
    public String drink() {
        return "";
    }

    @Override
    public String escape() {
        return "";
    }

    @Override
    public String eat() {
        return "";
    }
}
