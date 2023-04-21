class Test {
    public static int add(int v1, int v2) {
        int val = v1 + v2;
        return val;
    }
}

public class Day2_MethodType {
    public void sub(int v1, int v2) {
        int val = v1 - v2;
        System.out.println("Subtraction in instance method : " + val);

    }

    public void add(int v1, int v2) {
        int val = v1 + v2;
        System.out.println("Addition in instance method : " + val);
        this.sub(v1, v2);
    }

    public static void mul(int v1, int v2) {
        int val = v1 * v2;
        System.out.println("Multiplication in static method :" + val);
    }

    public static void main(String[] args) {
        mul(67, 44);
        Day2_MethodType mType = new Day2_MethodType();
        mType.add(50, 67);

        // we can call static methods withour creating an object of class
        System.out.println("addition from another class :" + Test.add(5, 14));

    }
}
