package weapons;

import java.util.Random;

public class Bow implements Weapon {

    private int distance = 30;

    Random rnd = new Random();

    public int getDistance() {
        return distance;
    }

    @Override
    public int damage() {
        return rnd.nextInt(55, 65);
    }

    @Override
    public String toString() {
        return "Bow{ " +
                "distance = " + distance +
                " damage = " + damage() +
                " }";
    }
}
