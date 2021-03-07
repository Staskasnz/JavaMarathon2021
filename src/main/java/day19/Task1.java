package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        try {
            File text = new File("src/main/resources/dushi.txt");
            Scanner scanner = new Scanner(text); // в text находится файл dushi.txt
            scanner.useDelimiter("[«»<.,:;()?!\"\\s–]+");

            Map<String, Integer> map = new HashMap<>();

            while (scanner.hasNextLine()){
                String oneWord = scanner.next();
                if(map.containsKey(oneWord)) {
                    map.put(oneWord, map.get(oneWord) + 1);
                } else {
                    map.put(oneWord,  1);
                }
            }

            List<String> list = new ArrayList<>();
            List<String> firstHundredList = new ArrayList<>();

            map.entrySet().stream()
                    .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                    .forEach(s -> list.add(s.getKey() + " встречается " + s.getValue() + " раз"));

            for (int i = 0; i < 100; i++) {
                firstHundredList.add(list.get(i));
                System.out.println(firstHundredList.get(i));
            }


        } catch (FileNotFoundException e){
            System.out.println("Файл не найден");
        }

    }
}
//Чичиков=603
