class Vehicle1{

    public void steering(){
        System.out.println("steering");
    }
}
class Car1 extends Vehicle{
    public void airBag(){
        System.out.println("airBag");
    }
}
class Truck extends Vehicle{
    public void HyrdaulicPump(){
        System.out.println("hydraulic pump");
    }
}
public class HieraricalInheritance {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.steering();

        Car1 c = new Car1();
        c.steering();
    }
}
