package day3;

abstract class  Test1{

    {
        System.out.println("Test 1 instance block");
    }
    static {
        System.out.println("Test 1 static block");
    }
    public abstract void m1();

    public void m2(){
        System.out.println("Method 2 from test 1");
    }

    public static void main(String[] args) {
        System.out.println("main from test 1");
    }

    public Test1() {
        System.out.println("Constructor from test1");
    }
}
class Test2 extends Test1{

    {
        System.out.println("Test 2 instance block");
    }
    static {
        System.out.println("Test 2 static block");
    }
    @Override
    public void m1() {
        System.out.println("m1 method  from Test2");
    }

    public Test2() {
        System.out.println("Constructor from test2");
    }
}
public class AbstractClass {
    public static void main(String[] args) {
            Test2 t = new Test2();
            t.m1();
            t.m2();
            Test2.main(args);

    }
}
