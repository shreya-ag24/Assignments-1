public class Day2_VarScope {
    int ins = 20;
    int val = 10;
    int val1 = 20;
    static String name = "Faizan";

    public void add() {
        int val = 15;
        int val1 = 25;

        System.out.println("sum is :" + (this.val + this.val1));

    }

    public static void main(String[] args) {
        int loc = 10;

        Day2_VarScope vso = new Day2_VarScope();
        System.out.println("Local variable :" + loc);
        System.out.println("instance variable :" + vso.ins);
        System.out.println("Static variable name :" + name);
    }
}
