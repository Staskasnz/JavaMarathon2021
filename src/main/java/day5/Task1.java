package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setRealise(1997);
        car.setColor("Yellow");
        car.setModel("Coup");
        System.out.println(car.getRelease());
        System.out.println(car.getColor());
        System.out.println(car.getModel());
    }
}
    class Car{
        private int release;
        private String color;
        private String model;

        public int getRelease() {
            return release;
        }
        public void setRealise(int realisex){
            release = realisex ;
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
    }

