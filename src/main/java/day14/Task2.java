package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        File file = new File("people");
        try {
            System.out.println(parseFileToStringList(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static List<String> parseFileToStringList(File file) throws FileNotFoundException {
        List<String> people = new ArrayList<>();
        Scanner scanner = new Scanner(file);
        for (int i = 0; i < 5; i++) {
            String line = scanner.nextLine();
            String[] members = line.split(" "); // создаем массив одной строки с размером 2.
            int age = Integer.parseInt(members[1]); // парсируем второй элемент массива в число
            if (age < 0) { //проверяем что возраст меньше нуля, если да то выбрасываем исключение
                try {
                    throw new ScanerExeption();
                } catch (ScanerExeption scanerExeption) {
                    System.out.println("Некорректный входной файл");
                    return null;
                }
            } else { // если возраст больше нуля то добавляем считаную строку из файла в список
                people.add(line);
            }
        }
        return people;
    }
}
