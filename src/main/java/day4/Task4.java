package day4;


import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[10];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10);
        }
        int sum = 0;
        int sumfin = 0;
        int index = 0;
        for (int i = 0; i < mass.length - 2; i++) {
            for (int j = i; j < i + 3; j++) {
                sum += mass[i];
            }
            if (sum > sumfin) {
                sumfin = sum;
                index = i;
            }
            sum = 0;
        }
        System.out.println("Ответ: " + index);


    }
}
