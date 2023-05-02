package day8.LearningCollections;

import java.util.*;

public class VectorClass {
    public static void main(String[] args) throws InterruptedException {
//        List<Integer> vectorList = new Vector<>();
//        long start2 = System.currentTimeMillis();
//
//        for (int i = 0; i < 1000000; i++) {
//            vectorList.add(i);
//        }
//        long end2 = System.currentTimeMillis();
//        System.out.println("Time for vectorList: " + (end2 - start2));
//        List<Integer> arrayList = new ArrayList<>();
//        long start = System.currentTimeMillis();
//
//        for (int i = 0; i < 1000000; i++) {
//            arrayList.add(i);
//        }
//        long end = System.currentTimeMillis();
//        System.out.println("Time for arraylist: " + (end - start));

        List<Integer> multiThreadArrayList = Collections.synchronizedList(new ArrayList<>());
        long start = System.currentTimeMillis();
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                multiThreadArrayList.add(i);
            }
        });
        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000000; i++) {
                multiThreadArrayList.add(i);
            }
        });
 long end  = System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        System.out.println("Multithreading time : " + (end-start));
    }
}
