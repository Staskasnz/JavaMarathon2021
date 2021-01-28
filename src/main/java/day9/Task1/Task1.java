package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Павел", "347");
        Teacher teacher = new Teacher("Ольга Владимировна", "информатика");

        student.printInfo();
        teacher.printInfo();
    }
}
