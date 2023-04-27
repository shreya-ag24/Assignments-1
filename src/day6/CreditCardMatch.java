package day6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CreditCardMatch {
    public static void main(String[] args) {


        String cardNumber ="4520-4567-5674-5674";

        Pattern patern  = Pattern.compile("\\d{4}-\\d{4}-\\d{4}-");
        Matcher matcher = patern.matcher(cardNumber);

        String maskCard = matcher.replaceAll("xxxx-xxxx-xxxx-");
        System.out.println(maskCard);

    }
}
