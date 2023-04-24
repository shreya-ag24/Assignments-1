package day1;

public class ForLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println("This is i loop with iteration no :"+i+1);
            for (int j = 0; j < 10; j++) {
                System.out.println("This is j loop with iteration no :"+j+1);
            }
        }
    }
}
