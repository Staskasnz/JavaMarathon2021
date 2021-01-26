package day6;

public class Task3 {
    public static void main(String[] args) {
        Student pavel = new Student("Павел");
        Teacher olgaVladislavovna = new Teacher("Ольга", "информатика");
        olgaVladislavovna.evaluate(pavel);
    }
}
