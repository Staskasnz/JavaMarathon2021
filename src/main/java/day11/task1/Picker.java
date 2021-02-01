package day11.task1;

public class Picker implements Worker {
    private int salary;
    private int isPayed;
    private Warehouse warehouse;
    private int countBonus;

    @Override
    public void bonus() {
        if (countBonus < 1) {
            if (warehouse.getCountPickedOrders() >= 10000) {
                this.isPayed += 70000;
                countBonus++;
            } else if (warehouse.getCountPickedOrders() < 10000) {
                System.out.println("Бонус пока не доступен");
            }
        }
            else {
                System.out.println("Бонус уже был выплачен.");
            }
        }

    public Picker(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    @Override
    public String toString () {
        return "Сборщик " +
                    "с зарплатой = " + salary +
                    " и бонусом = " + isPayed;
        }


    public int getSalary() {
        return salary;
    }

    public int getIsPayed() {
        return isPayed;
    }

    @Override
    public void doWork() {
        this.salary += 80;
        warehouse.pickedOrdersPlus();
    }
}