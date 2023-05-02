package day8.LearningCollections;

import java.util.*;

public class SetClass {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Faizan");
        hs.add("Faizan");
        hs.add("Faizan");
        hs.add("Faizan");
        hs.add("Faizan");
//        System.out.println(hs);

        //
        List<String>eventNames = new ArrayList<>();
        eventNames.add("uthna");
        eventNames.add("lecture");
        eventNames.add("sona");
        eventNames.add("khana");
        eventNames.add("sona");

        hs.addAll(eventNames);

//        System.out.println(hs);


        //LinkedHashset -> insertion order

        LinkedHashSet<Integer>linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(11);
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(11);
        linkedHashSet.add(5);
//        System.out.println(linkedHashSet);
        TreeSet<String>ts= new TreeSet<>();
        ts.add("a");
        ts.add("a");
        ts.add("c");
        ts.add("h");
        ts.add("u");
        ts.add("i");
        System.out.println(ts);//will be sorted

        String a = "a";
        String b ="l";
        System.out.println(a.compareTo(b));




    }


}
