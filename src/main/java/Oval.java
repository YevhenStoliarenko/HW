public class Oval extends Shape{
    public Oval(String name) {
        super(name);
    }

    @Override
    public void printName() {
        System.out.println("My name is " + getName() + " " + getClass());
    }
}
