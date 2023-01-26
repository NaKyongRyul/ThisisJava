package ch07.sec10.exam02;

public class AbstractMethodExample {

    public static void animalSound(Animal animal) {
        animal.sound();
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();

        Dog dog = new Dog();
        dog.sound();

        animalSound(new Cat());
        animalSound(dog);
    }
}
