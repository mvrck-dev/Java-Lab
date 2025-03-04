public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }
}
