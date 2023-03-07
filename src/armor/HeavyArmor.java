package armor;

import java.util.Random;

public class HeavyArmor implements Armor {
    Random rnd = new Random();

    @Override
    public int defense() {
        return rnd.nextInt(20, 30);
    }

    @Override
    public String toString() {
        return "HeavyArmor{ defense = " + defense() + " }";
    }
}
