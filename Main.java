// Parent class (Superclass)
class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public void sound() {
        System.out.println("Some generic sound");
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Bark");
    }
}

// Child class (Subclass) inheriting from Animal
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Meow");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog myDog = new Dog("Rex");
        Cat myCat = new Cat("Whiskers");

        System.out.println("Dog's name is " + myDog.name);
        myDog.sound();

        System.out.println("Cat's name is " + myCat.name);
        myCat.sound();
    }
}
