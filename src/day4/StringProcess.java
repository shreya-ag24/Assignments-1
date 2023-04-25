package day4;

public class StringProcess {
    public static void main(String[] args) {
        String s1="Faizan";
        String s2 = "Faizan";

        String s3 = new String("Faizan");
        String s4 = new String("Faizan");

        System.out.println(s1==s2);
        System.out.println(s1==s3);
        System.out.println(s3==s4);


        System.out.println(s1.length());
        System.out.println(s1.charAt(0));

        System.out.println(s1.replace("n","N"));

        String str[] = s1.split("");
        for (String s:str){
            System.out.println(s);
        }
        String userInput = "  mobile ";
        System.out.println(userInput.trim());


    }
}
