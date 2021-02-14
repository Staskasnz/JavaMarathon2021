package day18;

public class Task2 {
    public static void main(String[] args) {
        int num = 717771237;
        System.out.println(count7(num));
    }

    public static int countSeven; //счетчик для чисел 7;
    public static int remain; // сюда будем записывать остаток от деления

    public static int count7(int x){
        if (x != 0){
            remain = x % 10;
            if (remain == 7){
                countSeven++;
            }
            x /= 10;
            count7(x);
        }
        return countSeven;
    }
}
