public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackBehaviour = new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Red Head Duck");
    }
}
