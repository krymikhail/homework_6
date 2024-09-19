enum WeaponType {
    POISON,
    LONG_RANGE,
    MAGIC,
}

public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setWeapon(new Weapon(WeaponType.MAGIC, "Fireball"));

        boss.printInfo();

        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(150);
        skeleton1.setDamage(25);
        skeleton1.setWeapon(new Weapon(WeaponType.POISON, "Poison Dagger"));
        skeleton1.setArrowCount(10);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(200);
        skeleton2.setDamage(30);
        skeleton2.setWeapon(new Weapon(WeaponType.LONG_RANGE, "Bow"));
        skeleton2.setArrowCount(15);

        skeleton1.printInfo();
        skeleton2.printInfo();
    }
}