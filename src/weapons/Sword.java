package weapons;

import java.util.Random;

public class Sword implements Weapon {

    Random rnd = new Random();

    @Override
    public int damage() {
        return rnd.nextInt(40, 50);
    }

    @Override
    public String toString() {
        return "Sword{ damage = " + damage() + " }";
    }
}
