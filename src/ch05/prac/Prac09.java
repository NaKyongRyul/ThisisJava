package ch05.prac;

import java.util.Scanner;
public class Prac09 {
    public static void main(String[] args) {
        boolean run = true;
        while(run) {
            System.out.println("----------------------------");
            System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
            System.out.println("----------------------------");
            System.out.print("선택> ");

            Scanner scanner = new Scanner(System.in);
            String menuNum = scanner.nextLine();
            int stuNum = 0;
            int[] scores = null;

            switch(menuNum) {
                case "1":
                    System.out.print("학생수> ");
                    stuNum = scanner.nextInt();
                    scores = new int[stuNum];
                    break;
                case "2":
//                    for(int i=0; i<scores.length; i++) {
//                        System.out.print("scores[" + i + "]> " );
//                        int score = scanner.nextInt();
//                        scores[i] = score;
//                    }
                    break;
            }
        }
    }
}
