
//Base class animal
class Animal {
    String name;
    int age;

    void makeSound() {
    }
}

// subclass dog inheriting properties of animal class
class Dog extends Animal {

    // overriding method make sound
    void makeSound() {
        System.out.println("our animal is : " + name);
        System.out.println(name + "'s age is : " + age);
        System.out.println("dog barks");
    }
}

// subclass cat inheriting properties of animal class
class Cat extends Animal {

    // overriding method make sound
    void makeSound() {
        System.out.println("our animal is : " + name);
        System.out.println(name + "'s age is : " + age);
        System.out.println("cat meows ");
    }

}

// subclass Bird inheriting properties of animal class
class Bird extends Animal {
    // overriding method make sound
    void makeSound() {
        System.out.println("our animal is : " + name);
        System.out.println(name + "'s age is : " + age);
        System.out.println("Bird chirps ");
    }

}

public class AnimalHierarchy {

    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.name = "Dog";
        d1.age = 10;
        d1.makeSound();

        Cat c1 = new Cat();
        c1.name = "Cat";
        c1.age = 3;
        c1.makeSound();

        Bird b1 = new Bird();
        b1.name = "Bird";
        b1.age = 2;
        b1.makeSound();

    }
}