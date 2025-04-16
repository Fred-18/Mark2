package org.example.Race;

import Cast.Warrior;

public class Human extends Humanoide implements Behavior, Warrior {


    public Human(String name, int age, String gender, int hp, int mp, int attP, int defP, int speed) {
        super(name, age, gender, hp, mp, attP, defP, speed);
    }


    @Override
    public String speak(String name) {
        return "I am a human my name is " + name;
    }

    @Override
    public String drink() {
        return "Drink human potion";
    }

    @Override
    public String escape() {
        return null;
    }

    @Override
    public String eat() {
        return null;


    }

    @Override
    public void emprovement(Humanoide humamoide, int defp) {
        int currentDefencePoint = humamoide.getDefensePoints();
        humamoide.setDefensePoint(currentDefencePoint + defp);
    }

    @Override
    public void attack(Humanoide humanoide, int attP) {
        int currentHealthPoints = humanoide.getHealthPoint();
        humanoide.setHealthPoint(currentHealthPoints -= attP);
    }

    @Override
    public void bigAttack(Humanoide humanoide, int attP) {
        int currentAttackPoints = humanoide.getAttackPoint();
        humanoide.setAttackPoint(currentAttackPoints * 2);
        //todo methode a revoir
    }
}
