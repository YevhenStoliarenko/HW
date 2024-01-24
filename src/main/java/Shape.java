public abstract class Shape {
    String name;
    double area;
    final double PI = 3.14;
    public abstract void printName();

    public static final void printShape1(){
        System.out.println("From Shape");
    }

    public abstract double getArea();

    public Shape(String name, double area) {
        this.name = name;
        this.area = area;
    }
}
