package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike jamaha = new Motorbike(1955, "black", "new");
        jamaha.getinfo();
    }
}
    class Motorbike{
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


