package Cast;

public class Warrior {
    private int shield;
    private int Armor;
    private Weapons weapons;

    public Warrior(int shield, int Armor, Weapons weapons) {
        this.shield = shield;
        this.Armor = Armor;
        this.weapons = weapons;
    }

    public int getShield() {
        return shield;
    }

   public int setShield(int damage){
        if(shield < 0){
            damage =0;
        }
        int result = shield - damage;
        return result;
   }
   //todo retravailler cette methode

}
