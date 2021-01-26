package day5;

public class Motorbike{
    private int realize;
    private String color;
    private String model;

    public Motorbike(int realize, String color, String model) {
        this.realize = realize;
        this.color = color;
        this.model = model;
    }
    public void getinfo(){
        System.out.println(realize + " " + color + " " + model);
    }
}



