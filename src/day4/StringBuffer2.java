package day4;

public class StringBuffer2 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Wiley");
        StringBuffer sb2 = new StringBuffer("Wiley");
        StringBuffer sb3 = new StringBuffer("Wiley");

        String ss ="Wiley";
        System.out.println(ss.equals(sb2));
        System.out.println(ss.equals(sb.toString()));

        System.out.println(sb);

        sb.insert(5,"Edge");
        System.out.println(sb);

        System.out.println(sb.delete(5,9));
        System.out.println(sb.reverse());
    }
}
