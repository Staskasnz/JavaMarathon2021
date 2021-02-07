package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File numbers = new File("SomeInteger");
        printResult(numbers);
    }

    public static void printResult(File file) {
        int sum = 0;
        int count = 0;
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                int num = scanner.nextInt();
                sum += num;
                count++;
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        System.out.print((double) sum/count);
        System.out.print(" --> ");
        System.out.printf("%.3f", (double) sum/count);
    }
}

