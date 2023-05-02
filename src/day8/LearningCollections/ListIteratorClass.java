package day8.LearningCollections;

import java.util.*;

public class ListIteratorClass {
    public static void main(String[] args) {
        List<Integer> firstFivePrimeNumbers  = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        ListIterator listIterator  = firstFivePrimeNumbers.listIterator();

        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }


    }
}
