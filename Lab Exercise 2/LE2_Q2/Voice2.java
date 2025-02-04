class Voice2 {
    // This method enforces the sequence of calling prepareVoice() followed by hear()
    public void templateMethod() {
        // First, prepare the voices (create the array of animals)
        prepareVoice();
        
        // Then, hear the voices (loop through the array and call makeVoice)
        hear();
    }

    // Method to prepare the voice array (same as before)
    private void prepareVoice() {
        // Create an array of Animal objects with size 5
        Animal[] animals = new Animal[5];
        
        // Assign objects to array elements
        animals[0] = new Cow();
        animals[1] = new Dog();
        animals[2] = new Pig();
        animals[3] = new Goat();
        animals[4] = new Lion();
        
        // Store the array in a class-level variable for use in hear()
        this.animals = animals;
    }

    // Method to loop through the array and call makeVoice (same as before)
    private Animal[] animals;

    private void hear() {
        for (Animal animal : animals) {
            animal.makeVoice(); // Polymorphism: Calls the appropriate makeVoice method based on the object type
        }
    }
}
