package kg.geektech.les8.players;

import java.util.Random;

public class Warrior extends Hero {
    public Warrior(int health, int damage) {
        super(health, damage, SuperAbility.CRITICAL_DAMAGE);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        setDamage(20);
        Random random = new Random();
        int randomNumbers = random.nextInt(2) + 2;
        setDamage(getDamage() * randomNumbers);
        System.out.println("Warrior hit Boss with critical damage " + getDamage()*randomNumbers);
    }
}
