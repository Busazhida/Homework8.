package kg.geektech.les8.players;

public class Hunter extends Hero {
    public Hunter(int health, int damage) {
        super(health, damage, SuperAbility.SAVE_DAMAGE_AND_REVERT);
    }

    @Override
    public void applySuperAbility(Boss boss, Hero[] heroes) {
        setDamage(30);
        setDamage(getDamage() + boss.getDamage() / 2);
    }
}
