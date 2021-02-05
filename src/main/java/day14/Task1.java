package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        File file = new File("SomeInteger");

        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine(); //сканируем всю строку из файла
            String[] members = line.split(" ");// убираем пробелы между элементами и создаем массив
            if (members.length != 10) {
                throw new ScanerExeption();//если элементов в новом массиве не 10, то выкидываем исключение
            }
            printSumDigits(file);//если элементов 10 - активируем метод
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (ScanerExeption scanerExeption) {
            System.out.println("Некорректный входной файл");
        }
    }


    public static void printSumDigits(File file) throws FileNotFoundException {
        int sum = 0;
        Scanner scanner = new Scanner(file);
        int[] list = new int[10]; //создаем массив размера 10
        for (int i = 0; i < list.length; i++) { // заносим в ячейки массива числа из файла текст
            list[i] = scanner.nextInt();
            sum += list[i];
        }
        System.out.println(sum);
    }
}

