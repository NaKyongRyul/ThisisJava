package ch04.prac;

import java.util.Scanner;
public class Prac07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int account = 0;

        while(run) {
            System.out.println("---------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.println("---------------------");
            System.out.print("선택> ");

            int number = scanner.nextInt();

            switch(number) {
                case 1:
                    System.out.print("예금액>");
                    account += scanner.nextInt();
                    break;
                case 2:
                    System.out.print("출금액>");
                    account -= scanner.nextInt();
                    break;
                case 3:
                    System.out.println("잔고>" + account);
                    break;
                case 4:
                    run = false;
                    break;
            }
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
