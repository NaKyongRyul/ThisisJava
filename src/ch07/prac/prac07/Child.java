package ch07.prac.prac07;

public class Child extends Parent {
    public String name;

    public Child(String name) {
        this.name = name;
        System.out.println("Child(String name) call");
    }

    public Child() {
        this("홍길동");
        System.out.println("Child() call");
    }


}
