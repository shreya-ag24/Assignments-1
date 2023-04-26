package day5;

import day4.Student;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class StudentRecordReader {
    DataInputStream dataInput;
    DataOutputStream dataOutput;


    public StudentRecordReader(String inputFile) throws IOException {
        dataInput = new DataInputStream(new FileInputStream(inputFile));
    }

    public List<Student> readAll(String inputFile) throws IOException {


        List<Student> studentList = new ArrayList<>();
        try {
            while (true) {
                String name = dataInput.readUTF();
                String gender = dataInput.readUTF();
                int age = dataInput.readInt();
                float grade = dataInput.readFloat();

                System.out.println("Name : " + name);

                Student student = new Student(name, gender, age, grade);

                studentList.add(student);
            }
        } catch (Exception e) {

        }
        dataInput.close();
        return studentList;
    }


    public static void main(String[] args) throws IOException {
        String inputFile = "C:\\Users\\Faizan\\IdeaProjects\\Assignments\\src\\day4\\data\\practice.txt";

        try {
            StudentRecordReader reader = new StudentRecordReader(inputFile);
            List<Student> studentList = reader.readAll(inputFile);

            for (Student student : studentList) {
                System.out.println(student.getName() + "\t");
                System.out.println(student.getGender() + "\t");
                System.out.println(student.getAge() + "\t");
                System.out.println(student.getGrade() + "\t");

            }
        }
       catch(Exception e){
                e.printStackTrace();
            }
        }
    }



