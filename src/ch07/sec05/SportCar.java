package ch07.sec05;

public class SportCar extends Car {
    public void speedUp() {
        speed += 10;
    }
//    final로 지정되어서 오버라이딩 불가능
//    public void stop() {
//        System.out.println("스포츠카를 멈춤");
//        soeed = 0;
//    }
}
