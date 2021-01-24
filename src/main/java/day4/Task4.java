package day4;


import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[100];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10000);
        }
        int sum;
        int sumfin = 0;
        int index = 0;
        for (int i = 0; i < mass.length - 2; i++) {
            sum = mass[i] + mass[i + 1] + mass[i + 2];
            if (sum > sumfin) {
                sumfin = sum;
                index = i;
            }
        }
        System.out.println("Ответ: " + index);


    }
}
