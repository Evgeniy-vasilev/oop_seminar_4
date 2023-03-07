package armor;

import java.util.Random;

public class LightArmor implements Armor {

    Random rnd = new Random();

    @Override
    public int defense() {
        return rnd.nextInt(5, 20);
    }

    @Override
    public String toString() {
        return "LightArmor{ defense = " + defense() + " }";
    }
}
