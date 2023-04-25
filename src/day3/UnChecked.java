package day3;

import java.util.ArrayList;
 class StudentNotFound extends Throwable {
    public StudentNotFound(String studentNotFound) {
        super(studentNotFound);
    }
    public String toString(){
        return super.toString();
    }

}
public class UnChecked {
    public static void main(String[] args) {
        ArrayList<String>students = new ArrayList<>();

        students.add("Faizan");
        students.add("Sumit");
        students.add("Joel");
        if(!students.contains("Sohel")){
            try{
                throw new StudentNotFound("Student not found");
            }catch(StudentNotFound e){
                    e.printStackTrace();
                System.out.println(e.toString());

            }
            System.out.println("message one");
        }
    }
        }
