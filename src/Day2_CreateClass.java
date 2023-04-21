public class Day2_CreateClass {
    int a = 10;

    public void add() {
        System.out.println("Adding the number..");
    }

    public static void main(String[] args) {

        // create object with new keyword
        Day2_CreateClass cc = new Day2_CreateClass();
        cc.add();
        System.out.println(cc);
    }
}