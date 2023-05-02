package day8.LearningCollections;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class QueueClass {
    public static void main(String[] args) {
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
        pQueue.add(1);
        pQueue.add(4);
        pQueue.add(0);
        pQueue.add(9);
        pQueue.add(3);
        System.out.println(pQueue.remove());//trying to pop to see if we get the smallest number first

        System.out.println(pQueue.peek());

        Deque<Integer> pQueue2 = new LinkedList<>() ;
        pQueue2.add(1);
        pQueue2.add(4);
        pQueue2.add(0);
        pQueue2.add(9);
        pQueue2.add(3);
        System.out.println(pQueue2);


    }
}
