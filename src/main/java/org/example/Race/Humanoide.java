package org.example.Race;

public abstract class Humanoide {

    private String name;
    private int age;
    private String gender;
    private int healthPoint;
    private int magicPoint = 0;
    private int attackPoint;
    private int defensePoint;
    private int speed;

    public Humanoide() {
    }


    public Humanoide(String name, int age, String gender, int hp, int mp, int attP, int defP, int speed) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.healthPoint = hp;
        this.magicPoint = mp;
        this.attackPoint = attP;
        this.defensePoint = defP;
        this.speed = speed;
    }

    public int getDefensePoints() {
        return defensePoint;
    }

    public void setDefensePoint(int defensePoint) {
        this.defensePoint = defensePoint;
    }


    public int getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public int getAttackPoint() {
        return attackPoint;
    }

    public void setAttackPoint(int attackPoint) {
        this.attackPoint = attackPoint;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMagicPoint() {
        return magicPoint;
    }

    public void setMagicPoint(int magicPoint) {
        this.magicPoint = magicPoint;
    }


}
