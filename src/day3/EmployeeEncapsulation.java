package day3;

class Employee{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
class EmployeeImpl{
    public void show(Employee e){
        System.out.println("Show method");
        System.out.println("Name: "+e.getName() +" Age: " + e.getAge());
    }
}
public class EmployeeEncapsulation {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setName("Faizan");
        e.setAge(20);

        EmployeeImpl empl = new EmployeeImpl();
        empl.show(e);
    }
}
