package org.example.Race;

import Cast.Warrior;

public class Human extends Humanoide implements Behavior, Warrior {


    public Human(String name, int age, String gender, int hp, int mp, int attP, int defP, int speed) {
        super(name, age, gender, hp, mp, attP, defP, speed);
    }


    @Override
    public String speak(String name) {
        return "I am a human my name is " + getName();
    }

    @Override
    public String drink(int value) {
        int currentHealthPoints = getHealthPoint();
        if (currentHealthPoints < 0) {
            return "The caractere is already dead !!!";
        }
        currentHealthPoints += value;

        return getName() + " : Say i feel much better  " + currentHealthPoints + " hp +";
    }

    @Override
    public String eat(int value) {
        int currentHealthPoints = getHealthPoint();
        if (currentHealthPoints < 0) {
            return "The caractere is already dead !!!";
        }
        currentHealthPoints += value;

        return getName() + " : Huuuuuum Yummy food " + currentHealthPoints + " hp +";

        // todo redondance au niveau des methodes voir dans un refacto un condition switch
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
    public void bigAttack(Humanoide humanoide, int attp) {
        int currentAttackPoints = getAttackPoint() * attp;
        System.out.println(currentAttackPoints);
        int currentHealthPoints = humanoide.getHealthPoint();
        humanoide.setHealthPoint(currentHealthPoints -= currentAttackPoints);
    }
}
