package day6;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class WeddingCardWrap extends Thread{
    @Override
    public void run() {
        System.out.println("thread Name:- "+Thread.currentThread().getName());
    }
}
public class WeddingCard {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(4);

        for (int i = 1; i <100 ; i++) {
            executorService.execute(new WeddingCardWrap());
        }
    }
}
