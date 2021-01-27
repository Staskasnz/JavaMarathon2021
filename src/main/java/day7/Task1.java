package day7;

public class Task1 {
    public static void main(String[] args) {
    Airplane jatpack = new Airplane("jatpack","USA", 2021, 15, 20);
    Airplane ty300 = new Airplane("ty300","Russia", 1997, 200, 1487);
    Airplane.compareAirplanes(jatpack, ty300);
    }
}