package day6;

public class Task1 {
    public static void main(String[] args) {
        Car bmw = new Car();
        bmw.setRealise(1955);
        Motorbike jawa = new Motorbike(2010, "black", "new");
        bmw.info();
        jawa.info();
        System.out.println(bmw.yearDifference(1950));
        System.out.println(jawa.yearDifference(1950));
    }
}
