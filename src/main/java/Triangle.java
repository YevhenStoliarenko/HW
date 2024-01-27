public class Triangle extends Shape {
    public Triangle(String name) {
        super(name);
    }
    @Override
    public void printName() {
        System.out.println("My name is " + getName() + " " + getClass());
    }
}
