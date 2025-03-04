public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehaviour = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("I'm a Rubber Duck");
    }
}
