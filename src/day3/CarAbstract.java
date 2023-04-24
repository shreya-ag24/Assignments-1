package day3;
interface Bank{
    void account();
}
interface Bank1{
    void account();
}

interface ATM extends Bank,Bank1{
   void insertCard();
   void selectOption();

   void enterPassword();
}

abstract class newATM implements ATM{
    @Override
    public void account() {

    }

}
public class CarAbstract extends newATM {

    @Override
    public void insertCard() {
        System.out.println("Insert a card");
    }

    @Override
    public void selectOption() {
        System.out.println("Select Option");
    }

    @Override
    public void enterPassword() {
        System.out.println("Enter password");
    }
}
