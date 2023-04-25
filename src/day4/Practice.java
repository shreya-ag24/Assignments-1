package day4;

import java.io.*;

class Student{
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
public class Practice {

    static DataOutputStream dos;
    //to write in file

    //to read from file
    static DataInputStream dis;
    public static String getDataFromFile(String filePath) throws IOException {
        FileInputStream fis = new FileInputStream(filePath);
        dis = new DataInputStream(fis);
          StringBuilder sb = new StringBuilder();
        int i;
        while((i=dis.read())!=-1){
            sb.append((char)(i));
        }
        dis.close();
        dis.close();
    return sb.toString();
    }
    public static void putDataInFile(String filePath,Student student) throws IOException {
        FileOutputStream fos = new FileOutputStream(filePath);
        dos  = new DataOutputStream(fos);

        String studentData = "{ Name : "+student.getName()+", Gender :" + student.getGender()+", Age : "+student.getAge()+", Grade: "+student.getGrade()+" }";
        String getPreviousData = getDataFromFile(filePath) + studentData;
        byte[] by = getPreviousData.getBytes();
        dos.write(by);
        dos.flush();
        dos.close();

    }

    public static void main(String[] args) throws IOException {

        Student student = new Student("Faizan","Male",21,9.18);
//        Student student2 = new Student("Pratik","Male",22,9.18);

        //store in file

        putDataInFile("C:\\Users\\Faizan\\IdeaProjects\\Assignments\\src\\day4\\data\\practice.txt",student);
//        putDataInFile("C:\\Users\\Faizan\\IdeaProjects\\Assignments\\src\\day4\\data\\practice.txt",student2);


        //get from file

        System.out.println(getDataFromFile("C:\\Users\\Faizan\\IdeaProjects\\Assignments\\src\\day4\\data\\practice.txt"));
    }
}
