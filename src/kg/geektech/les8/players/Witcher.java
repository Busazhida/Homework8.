package kg.geektech.les8.players;

import java.util.Random;

public class Witcher extends Hero {
    public Witcher(int health, int damage) {
        super(health, damage, SuperAbility.VOLUNTEER);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i < heroes.length - 1; i++) {
            if (heroes[i].getHealth() < 0) {
                heroes[i].setHealth(heroes[i].getHealth() + getHealth());
                setHealth(0);
                break;
        }

        }
    }
}
