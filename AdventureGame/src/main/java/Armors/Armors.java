package Armors;

abstract class Armors {
    private String name;
    private int id;
    private int block;
    private int cash;
    public Armors(String name, int id, int block, int cash) {
        this.name = name;
        this.id = id;
        this.block = block;
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
    public int getBlock() {
        return block;
    }
    public void setBlock(int block) {
        this.block = block;
    }
    public int getCash() {
        return cash;
    }
    public void setCash(int cash) {
        this.cash = cash;
    }
    @Override
    public String toString() {
        return "Armors{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", block=" + block +
                ", cash=" + cash +
                '}';
    }
}
