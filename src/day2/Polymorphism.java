public class Polymorphism {

    public static void main(String[] args) {
        Person1 p = new Person1();
        p.walk();
        p.walk(5);

        Athelete a = new Athelete();
        a.walk();
    }
}
class Person1{
    public void walk(){
        System.out.println("I am walking 🚶");
    }

    //method overloading
    public void walk(int meters){
        System.out.println("I have been walking for "+meters +" meters now 🚶");
    }
}
class Athelete extends Person1{

    //method overriding
    @Override
    public void walk() {
        System.out.println("Run boi!! Runnnn🗿💪💪🏃‍♀️🏃‍♀️");
    }
}


