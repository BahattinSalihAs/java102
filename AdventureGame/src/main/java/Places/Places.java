package Places;

public abstract class Places {
    private String name;
    private String furniture;
    public Places(String name, String furniture) {
        this.name = name;
        this.furniture = furniture;
    }
    public String getName() {
        return name;
    }
    public String getFurniture() {
        return furniture;
    }
    @Override
    public String toString() {
        return "Places{" +
                "name='" + name + '\'' +
                ", furniture='" + furniture + '\'' +
                '}';
    }
}
