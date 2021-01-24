package day4;

import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        Random random = new Random();
        int m = 12;
        int n = 8;
        int sum1 = 0;
        int sum2 = 0;
        int[][] mass = new int[m][n];
        for (int i = 0; i < mass.length; i++) {
            if(sum2 > sum1){
                sum1 = sum2;
            }
            sum2 = 0;
            for (int j = 0; j < mass[i].length; j++) {
                mass[i][j] = random.nextInt(50);
                sum2 += mass[i][j];
            }
        }
        int sum3 = 0;
        int index = 0;
        for (int i = 0; i < mass.length; i++) {
            if (sum3 == sum1){
                index = i;
            }
            sum3 = 0;
            for (int j = 0; j < mass[i].length; j++) {
                sum3 += mass[i][j];
            }
        }
        System.out.println("Ответ: " + index);


    }
}
