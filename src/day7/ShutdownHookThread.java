package day7;

class CloseEvent extends Thread{
    @Override
    public void run() {
        System.out.println("Current thread "+Thread.currentThread().getName());
    }
}
public class ShutdownHookThread {
    public static void main(String[] args) {
        Runtime r = Runtime.getRuntime();
        r.addShutdownHook(new CloseEvent());

        for (int i = 0; i < 10; i++) {
            CloseEvent t = new CloseEvent();
            t.start();
        }
    }

}
