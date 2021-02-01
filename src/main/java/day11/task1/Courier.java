package day11.task1;

public class Courier implements Worker  {
    private int salary;
    private int isPayed;
    private Warehouse warehouse;
    private int countBonus;

    @Override
    public void bonus() {
        if (countBonus < 1) {
            if (warehouse.getCountPickedOrders() >= 10000) {
                this.isPayed += 50000;
                countBonus++;
            } else if (warehouse.getCountPickedOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            }
        }
        else {
            System.out.println("Бонус уже был выплачен.");
        }
    }

    @Override
    public void doWork() {
        this.salary += 100;
        warehouse.deliveredOrdersPlus();
    }

    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    public Courier(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString() {
        return "Курьер " +
                "с зарплатой = " + salary +
                " и бонусом = " + isPayed;
    }
}
