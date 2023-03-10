package items;

import armor.LightArmor;
import weapons.Bow;

public class Archer extends Warrior<Bow, LightArmor> implements DistanceAttacker {
    private int distance;

    public Archer(String name, Bow weapon, LightArmor armor) {
        super(name, weapon, armor);

        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " \n Archer {" +
                " distance = " + distance +
                " }";
    }
}
