package ch06.sec15;

public class Singleton {
    private static Singleton singleton = new Singleton();
    Singleton() {}
    static Singleton getInstance() {
        return singleton;
    }
}
