package day11.task1;

public class Courier implements Worker  {
    private int salary;
    private int isPayed;

    @Override
    public void bonus() {
        if (Warehouse.getCountDeliveredOrders() == 10000) {
            this.isPayed += 50000;
        } else if (Warehouse.getCountDeliveredOrders() < 10000){
            System.out.println("Бонус пока не доступен");
        }
        else {
            System.out.println("Бонус уже был выплачен.");
            this.isPayed += 50000;
        }
    }

    @Override
    public void doWork() {
        this.salary += 100;
        Warehouse.deliveredOrdersPlus();
    }

    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    public Courier(Warehouse warehouse) {

    }

    @Override
    public String toString() {
        return "Курьер " +
                "с зарплатой = " + salary +
                " и бонусом = " + isPayed;
    }
}
