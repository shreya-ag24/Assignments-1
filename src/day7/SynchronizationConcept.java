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
public class SynchronizationConcept {
    public static void main(String[] args) {
        Person1 person1 = new Person1();
        person1.start();
        Person1 person2 = new Person1();
        person2.start();
    }
}
