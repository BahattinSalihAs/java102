package Characters;

public abstract class Charact {
    private String name;
    private int id;
    private int damage;
    private int health;
    private int cash;
    private String[] furnitures;
    public Charact(String name, int damage, int health, int cash, int id) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.cash = cash;
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getCash() {
        return cash;
    }
    public void setCash(int cash) {
        this.cash = cash;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String[] getFurnitures() {
        return furnitures;
    }
    public void setFurnitures(String[] furnitures) {
        this.furnitures = furnitures;
    }
    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", damage=" + damage +
                ", health=" + health +
                ", cash=" + cash +
                '}';
    }
}
