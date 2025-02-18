// Interface with a single method display()
interface Testable {
    void display();
}

// Concrete class implementing Testable
class Test implements Testable {
    public void display() {
        System.out.println("Test class implementing display()");
    }
}

// Abstract class implementing Testable
abstract class AbsTest implements Testable {
    // No need to implement display() here
}

// Test program
public class q2 {
    public static void main(String[] args) {
        Test test = new Test();
        test.display();

        // Cannot instantiate abstract class
        // AbsTest absTest = new AbsTest(); // Compilation error
    }
}
