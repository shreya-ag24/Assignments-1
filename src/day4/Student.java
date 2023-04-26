package day4;

public class Student{
    private String name;
    private String gender;
    private int age;
    private double grade;

    public Student(String name, String gender, int age, double grade) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getGrade() {
        return grade;
    }

}