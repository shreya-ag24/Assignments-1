package day7;

class Demo implements Runnable{
    public void run(){
        System.out.println("Thread name: "+Thread.currentThread().getName());
    }
}
public class ThreadGroupConcept {
    public static void main(String[] args) {

        ThreadGroup tgParent = new ThreadGroup("Parent Group");
        ThreadGroup tgChild1= new ThreadGroup(tgParent,"Child Group");


        Thread t1 = new Thread(tgParent,new Demo(),"First");
        Thread t2 = new Thread(tgParent,new Demo(),"Second");
        Thread t3 = new Thread(tgParent,new Demo(),"Third");

        t1.start();
        System.out.println("active group of threads :"+tgParent.activeCount());
        t2.start();
        System.out.println("active group of threads :"+tgParent.activeCount());
        t3.start();

//        System.out.println("active group of threads :"+tgParent.activeCount());
        System.out.println("child group of threads :"+tgChild1.activeCount());
        System.out.println("active group of threads :"+tgParent.activeCount());

    }
}
