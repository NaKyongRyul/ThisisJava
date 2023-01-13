package ch05.prac;

public class Prac08 {
    public static void main(String[] args) {
        int[][] array =  {
                {95, 86},
                {83, 92, 96},
                {78, 83, 93, 87, 88}
        };
        int totalCount = 0;
        int sum = 0;
        for(int i=0; i<array.length; i++) {
            totalCount += array[i].length;
            for(int k=0; k<array[i].length; k++) {
                sum += array[i][k];
            }
        }
        System.out.println("전체 합: " + sum);

        double avg = (double) sum / totalCount;
        System.out.println("전체 평균: " + avg);
    }
}
