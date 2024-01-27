public abstract class Shape {
    private String name;

    public String getName() {
        return name;
    }

    public abstract void printName();

    public Shape(String name) {
        this.name = name;
    }
}
