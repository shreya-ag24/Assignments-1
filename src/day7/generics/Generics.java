package day7.generics;

import java.util.*;

public class Generics {
    public static void main(String[] args) {
        Printer <String> printer = new Printer<>("Wiley Edge");


//
//        shout("Hellow ");
//        shout("hiee");

//        shout("Amount",20000);

        List<Integer>inList = new ArrayList<>();
        inList.add(3);
        inList.add(4);
        printList(inList);

    }

    public static void printList(List<?> myList){
        System.out.println(myList);
    }
    private static <T,V> void shout(T hiee,V val) {
        System.out.println(hiee+"......!");
        System.out.println(val+".... !");
    }
}
