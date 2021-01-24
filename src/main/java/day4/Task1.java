package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] mass = new int[size];
        for (int i = 0; i < size; i++) {
            mass[i] = random.nextInt(10);
        }
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int sum = 0;
        for (int i = 0; i < size; i++) {
            if (mass[i] > 8){
                count1++;
            }
            if (mass[i] == 1){
                count2++;
            }
            if (mass[i] % 2 == 0){
                count3++;
            }
            else {
                count4++;
            }
            sum += mass[i];
        }

        System.out.println("Введено число: " + size + ". Сгенерирован следующий массив:");
        System.out.println(Arrays.toString(mass));
        System.out.println("");
        System.out.println("Информация о массиве:");
        System.out.println("Длинна массива: " + size);
        System.out.println("Количествo чисел больше 8: " + count1);
        System.out.println("Количествo чисел равных 1: " + count2);
        System.out.println("Количество четных чисел: " + count3);
        System.out.println("Количество нечетных чисел: " + count4);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
