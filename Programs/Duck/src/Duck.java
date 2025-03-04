public abstract class Duck {
    protected QuackBehaviour quackBehaviour;

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public abstract void display();
}
