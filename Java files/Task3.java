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
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof is the sound of the dog");
    }
}

class Task3 {

    // Upper Bounded Wildcard Method that works for any subclass of Animal
    static void animalSound(List<? extends Animal> animalList) {
        for (Animal element : animalList) {
            element.sound();  // Calls the sound() method of Animal (or subclass)
        }
    }

    public static void main(String[] args) {
        // Create a List of Cats
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        // Create a List of Dogs
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        // Call animalSound() with different types of animals
        System.out.println("Cat sounds:");
        animalSound(cats);  // Calls the sound() method of Cat

        System.out.println("\nDog sounds:");
        animalSound(dogs);  // Calls the sound() method of Dog
    }
}
