import java.util.*;

class Animal {
    void sound() {
        System.out.println("Sounds of different animals");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow is the sound of the cat");
    }

    @Override
    public String toString() {
        return "Cat";  // Custom string representation for Cat objects
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof is the sound of the dog");
    }

    @Override
    public String toString() {
        return "Dog";  // Custom string representation for Dog objects
    }
}

class Task4 {

    // Method with Upper Bounded Wildcard (Accepts List of Animal or any subclass of Animal)
    static void animalSound(List<? extends Animal> animalList) {
        for (Animal element : animalList) {
            element.sound();  // Call the sound() method of each element
        }
    }

    // Method with Lower Bounded Wildcard (Accepts List of Cat or any superclass of Cat)
    static void addAcat(List<? super Cat> cats) {
        cats.add(new Cat());  // Add a new Cat to the list
    }

    public static void main(String[] args) {
        // Create a List of Animal objects
        List<Animal> animals = new ArrayList<>();
        animals.add(new Animal());
        animals.add(new Dog());

        // Call animalSound() with a list of different animals
        System.out.println("Animal sounds:");
        animalSound(animals);  // Calls the sound() method of Animal and Dog

        // Create a List of Cat objects
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        // Call animalSound() with a list of Cats
        System.out.println("\nCat sounds:");
        animalSound(cats);  // Calls the sound() method of Cat

        // Add a Cat to a List of Animals using Lower Bounded Wildcard
        System.out.println("\nAdding a Cat to a list of Animals:");
        addAcat(animals);  // This will add a Cat to the animals list

        // Print the animals list to verify that the Cat has been added
        System.out.println(animals);  // Should output: [Animal, Dog, Cat]
    }
}
