package day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexBasics {
    public static void main(String[] args) {
//        String re="...";
        //. means any character
        String re = "\\w\\w\\w"; //(a-z,A-Z,0-9)
        String text = "s_8";

        Pattern pattern = Pattern.compile(re);
        Matcher mt = pattern.matcher(text);

        boolean res = mt.matches();
        System.out.println(res);

    }
}
