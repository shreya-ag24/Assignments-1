package day5;

import java.awt.print.Book;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class SerializableObj {
    public static void main(String[] args) throws FileNotFoundException {
        Person person = new Person("Faizan",21,"9518944598");
        try{
            FileOutputStream fos = new FileOutputStream("person.ser");
            ObjectOutputStream oos  = new ObjectOutputStream(fos);
            oos.writeObject(person);
            fos.close();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
