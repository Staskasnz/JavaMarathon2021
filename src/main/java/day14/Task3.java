package day14;

import java.io.File;
import java.io.FileNotFoundException;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        try {
            System.out.println(Person.parseFileToObjList(file));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }
}
