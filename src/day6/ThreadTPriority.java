package day6;
class TPriority extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println(
                    "Thread name: "+Thread.currentThread().getName()+
                            " -     Thread priority "+Thread.currentThread().getPriority()
            );
        }
    }
}
public class ThreadTPriority {
    public static void main(String[] args) throws InterruptedException {
       TPriority t1 = new TPriority();

        TPriority t2 = new TPriority();
        TPriority t3= new TPriority();

        t1.start();
        t1.join(10);
        System.out.println(t1.getState());
        t2.start();
    }
}
