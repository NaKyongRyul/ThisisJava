package ch04.prac;

public class Prac03 {
    public static void main(String[] args) {
        int sum = 0;
        for(int i=1; i<=100; i++) {
            if(i%3 != 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("1~100까지 3의 배수의 총합은 " + sum +"입니다.");
    }
}
