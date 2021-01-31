package day11.task1;

public class Picker implements Worker {
    private int salary;
    private int isPayed;


    @Override
    public void bonus() {
        if (Warehouse.getCountPickedOrders() == 10000) {
            this.isPayed += 70000;

        } else if (Warehouse.getCountPickedOrders() < 10000){
            System.out.println("Бонус пока не доступен");
        }
        else {
            System.out.println("Бонус уже был выплачен.");
            this.isPayed += 70000;
        }
    }

    @Override
    public void doWork() {
        this.salary += 80;
        Warehouse.pickedOrdersPlus();
    }

    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    public Picker(Warehouse warehouse) {

    }

    @Override
    public String toString() {
        return "Сборщик " +
                "с зарплатой = " + salary +
                " и бонусом = " + isPayed;
    }
}
