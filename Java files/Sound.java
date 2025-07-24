class Animal {
    void sound() {
        System.out.println("Sounds of different animals");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow is the sound of cat");
    }
}

public class Sound {
    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.sound(); // Meow is the sound of cat
    }
}
