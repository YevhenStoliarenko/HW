public class ShapeTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle("circle1", 5, 1);
        circle1.printName();
        Quad quad1 = new Quad("quad1", 8, 2);
        //quad1.printName();
        System.out.println(circle1.getArea());
        System.out.println(quad1.getArea());
        Circle circle2 = new Circle("circel2", 7, 9);
        Circle circle3 = new Circle("circel3", 3, 10);
        System.out.println(circle2);
        System.out.println(circle3);



    }

}
