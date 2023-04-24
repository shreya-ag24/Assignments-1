package day3;


public class AccessModifiers {
    private int studentId;

    //private access modifier variable
    private String name;

    //default access modifier variable
    double percentage;

    protected int age;


    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    //public access modifier method

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    //default access modifier method
    void getNameWithPercentage(){
        System.out.println("Name :" + this.getName()+" Percentage :"+ this.getPercentage());
    }

    public static void main(String[] args){
            AccessModifiers s = new AccessModifiers();

            //was able to call default modifier
        System.out.println(s.percentage);
       s.getNameWithPercentage();
    }
}
