package team;

import items.DistanceAttacker;
import items.Warrior;

import java.util.ArrayList;
import java.util.List;

public class Team<T extends Warrior> {
    private List<T> team = new ArrayList<>();

    private String name;

    public Team(String name) {
        this.name = name;
    }

    public Team<T> addWarrior(T warrior) {
        team.add(warrior);
        return this;
    }

    public int getMaxDistance() {
        int distance = 0;
        for (T item : team) {
            if (!(item instanceof DistanceAttacker)) {
                continue;
            }
            DistanceAttacker temp = (DistanceAttacker) item;
            if (temp.getDistance() > distance) {
                distance = temp.getDistance();
            }
        }
        return distance;
    }

    public int getTeamDamage() {
        int sum = 0;
        for (T item : team) {
            sum += item.getMaxDamage();
        }
        return sum;
    }

    public int getTeamArmor() {
        int sum = 0;
        for (T item : team) {
            sum += item.getMaxArmor();
        }
        return sum;

    }

    @Override
    public String toString() {
        StringBuilder teamBuilder = new StringBuilder();
        for (T item : team) {
            teamBuilder.append(item.toString() + "\n");
        }
        return String.format("Team name: '%s', maxDistance = %d, maxDamage = %d, maxArmor = %d \n %s",
                name, getMaxDistance(), getTeamDamage(), getTeamArmor(), teamBuilder);
    }
}
