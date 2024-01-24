public class Circle extends Shape{
    double radius;


    public Circle(String name, double area, double radius) {
        super(name, area);
        this.radius = radius;
    }


    @Override
    public void printName() {
        System.out.println("My name is Circle " + name);

    }

    @Override
    public double getArea() {
        return radius * PI;
    }
}
