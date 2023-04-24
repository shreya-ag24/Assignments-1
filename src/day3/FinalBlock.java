package day3;

public class FinalBlock {
    public static void main(String[] args) {
        try{
            System.out.println("11111");
            System.out.println("wiley");
            System.out.println("edge");
        }
        catch(Exception e){
            System.out.println("catch block");
            System.exit(0);
            System.out.println(10/0);
            e.printStackTrace();
        }
        finally{
            System.out.println("Clone connection");
        }

        //nested try block
        try{
            System.out.println("Nested try block");
            try{
                System.out.println("111111");
            }catch (Exception e){
                e.printStackTrace();
            }
            finally{
                System.out.println("catch block");
            }
            System.out.println("Last Statement");

        }
        catch (Exception e){
            e.printStackTrace();
            try{
                System.out.println("Try block in catch block");
            }catch (Exception b){
                b.printStackTrace();
            }
            finally{
                System.out.println("Nested close connection");
            }
            System.out.println("fully Last Statement");
        }
    }
}
