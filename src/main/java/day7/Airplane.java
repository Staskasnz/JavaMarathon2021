package day7;

public class Airplane {
    private String model;
    private String producer; //(изготовитель)
    private int year; //(год выпуска)
    private int length; //(длина)
    private int weight; //(вес)
    private int fuel; //(количество)

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getFuel() {
        return fuel;
    }

    public Airplane(String model, String producer, int year, int length, int weight) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.length = length;
        this.weight = weight;
        this.fuel = 0;
    }

    public void info(){
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина:" +
                " " + length + ", вес: " + weight + ", количество топлива в баке: " + fuel);
    }
    public void fillUp(int n){
        this.fuel += n;
    }
    public static void compareAirplanes(Airplane one, Airplane two){
        if (one.length > two.length) {
            System.out.println(one.model + " длиннее");
        }
        else if (two.length > one.length){
            System.out.println(two.model + " длиннее");
        }
        else {
            System.out.println("Длины самолетов равны");
        }
    }
}



