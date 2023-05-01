package day3;

public class ThrowClass {
    public static void m1() throws InterruptedException {
        try{
            m2();
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    public static void m2() throws InterruptedException {
        Thread t = new Thread();
        Thread.sleep(1000);
    }

    public static void main(String[] args) throws InterruptedException {
        m1();
    }
}
