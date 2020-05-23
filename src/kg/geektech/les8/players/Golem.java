package kg.geektech.les8.players;

public class Golem extends Hero{
    public Golem(int health, int damage) {
        super(health, damage, SuperAbility.DEFENDER);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        for (int i = 0; i <heroes.length ; i++) {
            heroes[i].setHealth(heroes[i].getHealth() - boss.getDamage()/5);
        }
    }
}
