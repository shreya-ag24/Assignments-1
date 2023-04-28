package day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class WeddingCardWrap extends Thread{
    @Override
    public void run() {
        System.out.println("thread Name:- "+Thread.currentThread().getName());
    }
}
public class WeddingCard {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(4);
//
//        for (int i = 1; i <100 ; i++) {
//            executorService.execute(new WeddingCardWrap());
//        }

        ScheduledExecutorService scheduledExecutorService =Executors.newScheduledThreadPool(2);
        scheduledExecutorService.schedule(new WeddingCardWrap(),3, TimeUnit.SECONDS);


//        scheduledExecutorService.scheduleAtFixedRate(new WeddingCardWrap(),10,2,TimeUnit.SECONDS);
        scheduledExecutorService.scheduleWithFixedDelay(new WeddingCardWrap(),5,2,TimeUnit.SECONDS);

//        scheduledExecutorService.isTerminated();


    }
}
