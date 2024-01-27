public class Diamond extends Shape{

    public Diamond(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("My name is " + getName() + " " + getClass());
    }
}
