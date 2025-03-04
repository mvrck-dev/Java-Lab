// Duck.java
public abstract class Duck {
    QuackBehavior quackBehavior;

    public Duck() {
    }

    public abstract void display();

    public void performQuack() {
        quackBehavior.quack();
    }

    public void swim() {
        System.out.println("All ducks float, even decoys!");
    }

    public void setQuackBehavior(QuackBehavior qb) {
        quackBehavior = qb;
    }
}

// QuackBehavior.java
public interface QuackBehavior {
    void quack();
}

// Quack.java
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("Quack");
    }
}

// Squeak.java
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}

// MuteQuack.java
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}

// MallardDuck.java
public class MallardDuck extends Duck {
    public MallardDuck() {
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Mallard duck");
    }
}

// RedHeadDuck.java
public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a real Red Headed duck");
    }
}

// RubberDuck.java
public class RubberDuck extends Duck {
    public RubberDuck() {
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I'm a rubber duckie");
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.swim();

        System.out.println();

        Duck redHead = new RedHeadDuck();
        redHead.display();
        redHead.performQuack();
        redHead.swim();

        System.out.println();

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.swim();
    }
}
