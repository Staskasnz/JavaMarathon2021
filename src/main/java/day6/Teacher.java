package day6;


import java.util.Random;

public class Teacher {
    Random random = new Random();
    private String name;
    private String subject;
    private String value;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student any){
        int grade = random.nextInt(3) + 2;

        switch (grade){
            case 2:
                value = "неудовлитворительно";
                break;
            case 3:
                value = "удовлетворительно";
                break;
            case 4:
                value = "хорошо";
                break;
            case 5:
                value = "отлично";
                break;
        }
        System.out.println("Преподаватель " + this.name + " оценил студента с именем " + any.getName()  + " по предмету " + subject + " на оценку " + value +".");
    }

}
