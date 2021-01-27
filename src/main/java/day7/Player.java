package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    private static int countPlayers;

    public Player(int stamina) {
        this.stamina = stamina;
        countPlayers++;
        if (countPlayers > 6){
            countPlayers = 6;
        }
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }

    public void run(){
        stamina--;
        if(stamina == 0){
            countPlayers--;
        }
    }

    public static void info(){
        if(countPlayers < 6) {
            System.out.println("На поле есть " + (6 - getCountPlayers()) + " свободных мест");
        }
            else{
            System.out.println("На поле нет свободных мест");
        }
    }
}
