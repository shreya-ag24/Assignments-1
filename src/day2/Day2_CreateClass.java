package day2;

public class Day2_CreateClass {
    int a = 10;

    public void add() {
        System.out.println("Adding the number..");
    }

    public static void main(String[] args) throws Exception {

        // create object with new keyword
        Day2_CreateClass cc = new Day2_CreateClass();
        cc.add();
        System.out.println(cc);

        try {
            Class c = Class.forName("day2.Day2_CreateClass");
            Day2_CreateClass c1 = (Day2_CreateClass) c.newInstance();
            c1.add();
            System.out.println(c1);

        } catch (Exception e) {
            e.printStackTrace();
        }
        Day2_CreateClass objClone = (Day2_CreateClass) cc.clone();
        objClone.add();
        System.out.println("objectClone: " + objClone);
    }
}