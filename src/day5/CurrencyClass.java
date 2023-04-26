package day5;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyClass {
    public static void main(String[] args) {
        Currency usd = Currency.getInstance("USD");

        NumberFormat frm = NumberFormat.getCurrencyInstance(Locale.US);

        String formattedval = frm.format(108.5);
        System.out.println(formattedval);

        double price = 2000.25;
        Locale local  = new Locale("en","US");
        NumberFormat currFormatter = NumberFormat.getCurrencyInstance(local);
        String finalPrice = currFormatter.format(price);


        System.out.println(finalPrice);

        Currency usd2  = Currency.getInstance("USD");
        Currency rupee = Currency.getInstance("INR");

        System.out.println(Currency.getAvailableCurrencies());
    }
}
