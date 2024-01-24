public class Quad extends Shape{
    int side;
    public Quad(String name, double area, int side) {
        super(name, area);
        this.side = side;
    }

    @Override
    public void printName() {
        System.out.println("My name is Quad " + name);
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
