package day8;

public class Task1 {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        String string1 = "";
        for (int i = 0; i <= 20000; i++) {
            string1 += (i + " ");
        }
        long finish = System.currentTimeMillis();
        long timeConsumedMillis = finish - start;
        System.out.println(timeConsumedMillis);


        long start2 = System.currentTimeMillis();
        StringBuilder string2 = new StringBuilder();
        for (int i = 0; i <= 20000; i++) {
            string2.append(i).append(" ");
        }
        long finish2 = System.currentTimeMillis();
        long timeConsumedMillis2 = finish2 - start2;
        System.out.println(timeConsumedMillis2);
    }


}
