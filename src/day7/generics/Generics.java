package day7.generics;

import java.util.*;

public class Generics {
    public static void main(String[] args) {
        //		Printer<Cat> printer = new Printer(new Cat());
//		printer.print();


//		Printer<Dog> dogPrinter = new Printer(new Dog());
//		dogPrinter.print();



//		ArrayList<Object> cats = new ArrayList<>();
//		cats.add(new Cat());
//		cats.add(new Cat());
//		cats.add(new Dog());

//		shout("hello");
//		shout("Bring Coffee");
//		shout("Amount", 60000);

        List<Integer> intList = new ArrayList<>();
        intList.add(3);
        printList(intList);

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat());
        printList(catList);
    }

    private static void printList(List<?> myList) {
        System.out.println(myList);
    }

    private static <T, V> T shout(T shoutOUt, V valtoBring) {
        System.out.println(shoutOUt + " ...!!!!");
        System.out.println(valtoBring + " ...!!!!");

        return shoutOUt;
    }
}