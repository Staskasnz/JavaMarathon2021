package day11.task1;

public class Warehouse {
    private static int countPickedOrders;
    private static int countDeliveredOrders;

    @Override
    public String toString() {
        return "На складе " +
                "колличество собранных заказов = " + countPickedOrders +
                ", количество доставленных заказов = " + countDeliveredOrders;
    }

    public static int getCountPickedOrders() {
        return countPickedOrders;
    }

    public static int getCountDeliveredOrders() {
        return countDeliveredOrders;
    }

    public static void pickedOrdersPlus() {
        countPickedOrders++;
    }

    public static void deliveredOrdersPlus() {
        countDeliveredOrders++;
    }
}
