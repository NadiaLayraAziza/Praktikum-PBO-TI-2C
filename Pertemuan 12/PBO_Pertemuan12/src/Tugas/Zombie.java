package Tugas;

abstract class Zombie implements Destroyable {
    protected int health;
    protected int level;

    abstract public void heal();

    @Override
    abstract public void destroyed();

    public String getZombieInfo() {
        return "Health = " + this.health + "\n"
                + "Level = " + this.level + "\n";
    }
}
