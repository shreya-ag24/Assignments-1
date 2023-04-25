package day4;

import java.util.Arrays;
import java.util.List;

public class StringFormat {
    public static void main(String[] args) {
        String title = "Jav Developer";
        float salary = 2000.3999f;


        List<String> techStack = Arrays.asList("philosopher's stone","the prisoner of azkaban","deathly hallows");
        for (String s:techStack) {
            System.out.printf("Harry potter and %-10s - is available in the store %n",s);
        }
    }
}
