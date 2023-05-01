package day3;

import java.io.IOException;

public class ExceptionPropagation {
    public static void main(String[] args) {
        try{
            method1();
        }catch (Exception e){
            if(e.equals(new IOException())){
                System.out.println(e);
            }
            System.out.println(" Exception caught : "+ e.getMessage());
        }
    }

    public static void method1() throws Exception {
        method2();
    }

    public static void method2()throws Exception {
        throw new Exception("Exception occurred in method 2");
    }
}
