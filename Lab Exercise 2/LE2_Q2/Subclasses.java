class Cow extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Moo!");
    }
}

class Dog extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Woof!");
    }
}

class Pig extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Oink!");
    }
}

class Goat extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Baa!");
    }
}

class Lion extends Animal {
    @Override
    public void makeVoice() {
        System.out.println("Roar!");
    }
}
