class Skeleton extends Boss {
    private int arrowCount;

    public int getArrowCount() {
        return arrowCount;
    }

    public void setArrowCount(int arrowCount) {
        this.arrowCount = arrowCount;
    }

    public void printInfo() {
        System.out.println("Skeleton Info: ");
        System.out.println("Health: " + getHealth());
        System.out.println("Damage: " + getDamage());
        System.out.println("Weapon: " + getWeapon().getName() + " (Type: " + getWeapon().getType() + ")");
        System.out.println("Arrow Count: " + arrowCount);
    }
}