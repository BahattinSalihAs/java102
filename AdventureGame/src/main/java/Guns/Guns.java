package Guns;

abstract class Guns {
    private String name;
    private int id;
    private int damage;
    private int cash;
    public Guns(String name, int id, int damage, int cash) {
        this.name = name;
        this.id = id;
        this.damage = damage;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getCash() {
        return cash;
    }
    public void setCash(int cash) {
        this.cash = cash;
    }
    @Override
    public String toString() {
        return "Gun{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", damage=" + damage +
                ", cash=" + cash +
                '}';
    }
}
