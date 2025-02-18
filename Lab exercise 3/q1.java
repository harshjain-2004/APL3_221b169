// Abstract base class representing Bharatvanshi
abstract class Bharatvanshi {
    abstract void fight(); // All Bharatvanshis can fight
}

// Abstract class for Pandavs
abstract class Pandav extends Bharatvanshi {
    void obey() {
        System.out.println(getClass().getSimpleName() + " is obedient.");
    }
    
    void kind() {
        System.out.println(getClass().getSimpleName() + " is kind.");
    }
}

// Specific Pandavs
class Arjun extends Pandav {
    public void fight() {
        System.out.println("Arjun is a skilled fighter.");
    }
}

class Bheem extends Pandav {
    public void fight() {
        System.out.println("Bheem is a powerful fighter.");
    }
    
    @Override
    void kind() {
        System.out.println("Bheem is a little less kind.");
    }
}

// Abstract class for Kauravs
abstract class Kaurav extends Bharatvanshi {
    void obey() {
        System.out.println(getClass().getSimpleName() + " disobeys.");
    }

    void kind() {
        System.out.println(getClass().getSimpleName() + " is cruel.");
    }
}

// Specific Kauravs
class Duryodhan extends Kaurav {
    public void fight() {
        System.out.println("Duryodhan is a fierce fighter.");
    }
}

class Vikarn extends Kaurav {
    public void fight() {
        System.out.println("Vikarn is a noble and good fighter.");
    }
    
    @Override
    void obey() {
        System.out.println("Vikarn is obedient.");
    }

    @Override
    void kind() {
        System.out.println("Vikarn is kind.");
    }
}

// Main class to test
public class q1 {
    public static void main(String[] args) {
        Arjun arjun = new Arjun();
        Bheem bheem = new Bheem();
        Duryodhan duryodhan = new Duryodhan();
        Vikarn vikarn = new Vikarn();

        arjun.fight();
        arjun.obey();
        arjun.kind();

        bheem.fight();
        bheem.obey();
        bheem.kind();

        duryodhan.fight();
        duryodhan.obey();
        duryodhan.kind();

        vikarn.fight();
        vikarn.obey();
        vikarn.kind();
    }
}
