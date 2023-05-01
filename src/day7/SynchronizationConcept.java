package day7;

class Sheet{
    public  void writeln(int k){
        synchronized (this){
            for (int i = 1; i <=10 ; i++) {
                System.out.println("Addition "+i+k);
            }
        }
        for (int i = 1; i <=10 ; i++) {
            System.out.println("Multiply "+i*k);
        }
    }
}
class Person1 extends Thread{
    Sheet st;

    public Person1(){

    }
    @Override
    public void run() {
        st.writeln(5);
    }
}
class Person2 extends Thread{
    Sheet st;

    public Person2(Sheet st) {
        super();
        this.st = st;
    }
    @Override
    public void run() {
        st.writeln(5);
    }
}
public class SynchronizationConcept {
    public static void main(String[] args) {
        Sheet st = new Sheet();

//        Person1 t1 = new Person1(st);
        Person2 t2 = new Person2(st);

//        t1.start();
        t2.start();
    }
}
