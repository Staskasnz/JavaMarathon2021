package day7;

import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        Random random = new Random();

        Player pavel = new Player(random.nextInt(10) + 90);
        Player ivan = new Player(random.nextInt(10) + 90);
        Player jakob = new Player(random.nextInt(10) + 90);
        Player jack = new Player(random.nextInt(10) + 90);
        Player oleg = new Player(random.nextInt(10) + 90);
        Player john = new Player(random.nextInt(10) + 90);

        Player.info();

        while (pavel.getStamina() > 0) {
            pavel.run();
        }

        Player.info();
    }
}
