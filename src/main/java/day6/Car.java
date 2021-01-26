package day6;

public class Car {
    private int realize;
    private String color;
    private String model;

    public int getRelease() {
        return realize;
    }
    public void setRealise(int realisex){
        realize = realisex ;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }

    public void info(){
        System.out.println("Это автомобиль");
    }
    public int yearDifference(int inputYear) {
        return Math.abs(inputYear - realize);
    }
}

