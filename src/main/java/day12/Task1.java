package day12;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<String> Cars = new ArrayList<>();
        Cars.add("BMW");
        Cars.add("AUDI");
        Cars.add("VOLVO");
        Cars.add("LADA");
        Cars.add("NISSAN");
        Cars.set(2, "Zaporozhets");
        Cars.remove(0);
        System.out.println(Cars);
    }
}
