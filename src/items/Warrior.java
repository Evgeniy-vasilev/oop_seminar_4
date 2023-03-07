package items;

import armor.Armor;
import weapons.Weapon;

import java.util.Random;

public abstract class Warrior<T extends Weapon, E extends Armor> {
    private String name;
    protected T weapon;
    protected E armor;
    private int healthPoint;
    protected Random rnd = new Random();

    public Warrior(String name, T weapon, E armor) {
        this.name = name;
        this.weapon = weapon;
        this.armor = armor;
        healthPoint = 100;
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.damage());
        enemy.reduceHealthPoint(damage);
        return damage;
    }

    public int getMaxDamage() {
        return weapon.damage();
    }

    public int getMaxArmor() {
        return armor.defense();
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public void reduceHealthPoint(int damage) {
        this.healthPoint -= damage;
    }

    @Override
    public String toString() {
        return "Warrior {" +
                " name = '" + name + '\'' +
                ", weapon = " + weapon +
                ", armor = " + armor +
                ", healthPoint = " + healthPoint +
                " }";
    }
}
