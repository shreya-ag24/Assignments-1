class Vehicle{
    public void tier(){
        System.out.println("tier");
    }
    public void steering(){
        System.out.println("steering");
    }
}
class Car extends Vehicle{
    public void airBag(){
        System.out.println("airBag");
    }
}
class SmartCar extends Vehicle{
    public void sensor(){
        System.out.println("Sensor");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
    SmartCar sc = new
            SmartCar();

    sc.sensor();
    sc.tier();
    sc.steering();
    }
}
