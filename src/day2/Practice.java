 class A {
     public void parentMethod(){
         System.out.println("root class method");
     }
     public void parentMethod2(){
         System.out.println("root class method2 ---");
     }
}
class B extends A{
    public void methodFromB(){
        System.out.println("This is class B inheriting from class A");
    }
}
class C extends A{
    public void methodFromC(){
        System.out.println("This is class C inheriting from class A");
    }
}
//hierarchical inheritance
class D extends B{
    public void methodFromD(){
        System.out.println("This is class D inheriting from class B");
    }
}


class E extends D{
    public void methodFromE(){
        System.out.println("This is class E inheriting from class D");
    }
}
//multilevel inheritance
public class Practice{
    public static void main(String[] args) {
        B b = new B();
        b.parentMethod();

        C c = new C();
        c.parentMethod2();

        E e = new E();
        e.methodFromD();
    }
}