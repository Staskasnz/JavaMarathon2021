package day15;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File shoes = new File("src/main/resources/shoes.csv");

        try {
            OutputStream missing_shoes2 = Files.newOutputStream(Path.of("src/main/resources/missing_shoes2.txt")); //создаем новый файл
            Scanner scanner = new Scanner(shoes);
            PrintWriter pw = new PrintWriter(missing_shoes2);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] members = line.split(";"); // создаем массив одной считанной строки с размером 2.
                int count = Integer.parseInt(members[2]); // парсируем третий элемент массива в число
                String lineMissingShoes = members[0] + ", " + members[1] + ", " + members[2];
                if (count == 0) { //проверяем что количество = 0
                    pw.println(lineMissingShoes);
                }
            }
            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Файл не создан");
        }

    }
}
