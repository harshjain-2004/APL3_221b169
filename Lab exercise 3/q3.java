// Interface for FlyBehavior
interface FlyBehavior {
    void fly();
}

class NoFly implements FlyBehavior {
    public void fly() {
        System.out.println("This duck can't fly.");
    }
}

class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("This duck flies with wings.");
    }
}

// Interface for QuackBehavior
interface QuackBehavior {
    void quack();
}

class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("This duck is mute.");
    }
}

class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("This duck squeaks.");
    }
}

class QuackLoud implements QuackBehavior {
    public void quack() {
        System.out.println("This duck quacks loudly.");
    }
}

// Base Duck class
abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    void swim() {
        System.out.println("This duck swims.");
    }

    void performFly() {
        flyBehavior.fly();
    }

    void performQuack() {
        quackBehavior.quack();
    }

    abstract void display();
}

// Specific Ducks
class RubberDuck extends Duck {
    public RubberDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new Squeak();
    }

    public void display() {
        System.out.println("I am a Rubber Duck.");
    }
}

class WoodenDuck extends Duck {
    public WoodenDuck() {
        flyBehavior = new NoFly();
        quackBehavior = new MuteQuack();
    }

    public void display() {
        System.out.println("I am a Wooden Duck.");
    }
}

class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackLoud();
    }

    public void display() {
        System.out.println("I am a RedHead Duck.");
    }
}

class LakeDuck extends Duck {
    public LakeDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new QuackLoud();
    }

    public void display() {
        System.out.println("I am a Lake Duck.");
    }
}

// Main class to test
public class q3 {
    public static void main(String[] args) {
        Duck rubberDuck = new RubberDuck();
        Duck woodenDuck = new WoodenDuck();
        Duck redHeadDuck = new RedHeadDuck();
        Duck lakeDuck = new LakeDuck();

        rubberDuck.display();
        rubberDuck.performFly();
        rubberDuck.performQuack();
        rubberDuck.swim();

        woodenDuck.display();
        woodenDuck.performFly();
        woodenDuck.performQuack();
        woodenDuck.swim();

        redHeadDuck.display();
        redHeadDuck.performFly();
        redHeadDuck.performQuack();
        redHeadDuck.swim();

        lakeDuck.display();
        lakeDuck.performFly();
        lakeDuck.performQuack();
        lakeDuck.swim();
    }
}
