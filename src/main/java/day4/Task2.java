package day4;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] mass = new int[100];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(10000);
        }
        int max = 0;
        int min = 0;
        int count0 = 0;
        int sum0 = 0;
        for (int x: mass){
            if (x > max){
                max = x;
            }
            if (x < min){
                min = x;
            }
            if (x % 10 == 0){
                count0++;
                sum0 += x;
            }
        }
        System.out.println("Наибольший элемент массива: " + max);
        System.out.println("Наименьший элемент массива: " + min);
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + count0);
        System.out.println("Cумма элементов массива, оканчивающихся на 0: " + sum0);
    }
}
