public class ShapeTest {
    public static void main(String[] args) {
        PrintShape print = new PrintShape();
        Circle circle = new Circle("circle");
        Square square = new Square("square");
        Triangle triangle = new Triangle("triangle");
        Oval oval = new Oval("oval");
        Diamond diamond = new Diamond("diamond");
        print.printShape(circle);
        print.printShape(square);
        print.printShape(triangle);
        print.printShape(oval);
        print.printShape(diamond);


    }

}
