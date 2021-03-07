package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        try {
            File text = new File("src/main/resources/numbers19.txt");
            Scanner scanner = new Scanner(text);
            Set<Long> set = new HashSet<>();
            int count = 0;

            while (scanner.hasNext()){
                set.add(scanner.nextLong());
                if (scanner.nextLong() >= 500000000 && scanner.nextLong() <= 600000000){
                    count++;
                }
            }

            System.out.println(count);


        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
