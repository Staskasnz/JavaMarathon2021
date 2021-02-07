package day16;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        try {
            PrintWriter pw1 = new PrintWriter(file1);
            for (int i = 0; i < 1000; i++) {
                pw1.println(random.nextInt(101)); // Закидываем рандомные числа в файл1
            }
            pw1.close();

            Scanner scanner = new Scanner(file1);
            PrintWriter pw2 = new PrintWriter(file2);
            int count = 0;
            int sum = 0;
            while (scanner.hasNextInt()){ // если есть число, суммируем его с предыдущими
                int num = scanner.nextInt();
                sum += num;
                count++;
                if (count == 20){ // дошли до 20-го числа, записываем среднеарифмитическое в файл 2, и обнуляем счетчики
                    pw2.printf("%.2f", (double) sum/num);
                    pw2.println("");
                    count = 0;
                    sum = 0;
                }
            }
            pw2.close();
            scanner.close(); // закрываем потоки
        } catch (IOException e) {
            System.out.println("Файл не найден");
        }
        printResult(file2); // вызываем метод на файле2
    }

    public static void printResult(File file){
        try {
            Scanner scanner = new Scanner(file);
            double sum = 0;
            while (scanner.hasNextDouble()){ // если в файле есть чило дабл, суммируем
                double num = scanner.nextDouble();
                sum += num;
            }
            System.out.println((int)sum); // выводим на экран интовую сумму чисел из фала2
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
