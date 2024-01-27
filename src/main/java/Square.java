public class Square extends Shape{
    public Square(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("My name is " + getName() + " " + getClass());
    }

}
