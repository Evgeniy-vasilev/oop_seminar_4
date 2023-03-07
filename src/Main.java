import armor.HeavyArmor;
import armor.LightArmor;
import items.Archer;
import items.SwordMan;
import items.Warrior;
import team.Team;
import weapons.Bow;
import weapons.Sword;

public class Main {
    public static void main(String[] args) {
        Team<Warrior> mixTeam = new Team<>("Team 1");
        mixTeam.addWarrior(new SwordMan("Petya", new Sword(), new HeavyArmor()))
                .addWarrior(new Archer("Vasya", new Bow(), new LightArmor()))
                .addWarrior(new Archer("Misha", new Bow(), new LightArmor()))
                .addWarrior(new Archer("Grisha", new Bow(), new LightArmor()));

        System.out.println(mixTeam);

        Team<Warrior> mixTeam2 = new Team<>("Team 2");
        mixTeam2.addWarrior(new Archer("Vasya", new Bow(), new LightArmor()))
                .addWarrior(new SwordMan("Petya", new Sword(), new HeavyArmor()))
                .addWarrior(new Archer("Misha", new Bow(), new LightArmor()))
                .addWarrior(new SwordMan("Grisha", new Sword(), new HeavyArmor()));

        System.out.println(mixTeam2);

        SwordMan greg = new SwordMan("Petya", new Sword(), new HeavyArmor());
        Archer misha = new Archer("Misha", new Bow(), new LightArmor());

        while (greg.getHealthPoint() > 0 && misha.getHealthPoint() > 0) {
            int damage1 = greg.hitDamage(misha);
            int damage2 = misha.hitDamage(greg);
            System.out.printf("Hp greg: %d, Hp misha: %d \n", greg.getHealthPoint(), misha.getHealthPoint());
        }

        if (greg.getHealthPoint() > 0)
            System.out.println("greg win!");
        else
            System.out.println("misha win!");
    }
}