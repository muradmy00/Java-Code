// Single Inheritance
class Animal1 {
    void eat() {
        System.out.println("Animal is eating...");
    }
}

class Dogs extends Animal1 {
    void bark() {
        System.out.println("Dog is barking...");
    }
}

// Multilevel Inheritance
class Bird extends Animal1 {
    void fly() {
        System.out.println("Bird is flying...");
    }
}

class Parrot extends Bird {
    void speak() {
        System.out.println("Parrot is speaking...");
    }
}

// Hierarchical Inheritance
class Cat extends Animal1 {
    void meow() {
        System.out.println("Cat is meowing...");
    }
}

class Lion extends Animal1 {
    void roar() {
        System.out.println("Lion is roaring...");
    }
}

public class SingleMultilevelHierarchical {
    public static void main(String[] args) {
        Dogs dog = new Dogs();
        dog.eat();
        dog.bark();

        Parrot parrot = new Parrot();
        parrot.eat();
        parrot.fly();
        parrot.speak();

        Cat cat = new Cat();
        cat.eat(); 
        cat.meow();

        Lion lion = new Lion();
        lion.eat();
        lion.roar();
    }
}

