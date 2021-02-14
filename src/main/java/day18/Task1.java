package day18;

public class Task1 {
    public static void main(String[] args) {

        int[] numbers = {1, 10, 1241, 50402, -50, 249, 10215, 665, 2295, 7, 311};
        System.out.println(recursionSum(numbers));
    }
    public static int sum;
    public static int count;
    public static int recursionSum(int[] num){
        sum += num[count];
        count++;

        if (count < num.length){
            recursionSum(num);
        }
        return sum;
    }
}
