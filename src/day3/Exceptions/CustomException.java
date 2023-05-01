package day3;

 class AgeNotValid extends Exception
{
    public AgeNotValid(String ageIsNotValid) {
        super(ageIsNotValid);
    }

    @Override
    public String getMessage() {
        return "this age is not valid";
    }

    @Override
    public String toString() {
        return "age is not  applicable";
    }

}

public class CustomException {
    public static void getAge(int age) throws AgeNotValid{
        if(age>18){
            try{
              throw new AgeNotValid("age is not valid");
            }
            catch (Exception e){
                e.printStackTrace();
                System.out.println(e.getMessage());
                System.out.println(e.toString());
            }
        }else {
            System.out.println("age is valid");
        }

    }

    public static void main(String[] args) throws AgeNotValid {
        getAge(23);
    }
}
