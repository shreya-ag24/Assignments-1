package day5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessClass {
    public static void main(String[] args) throws IOException {
        try{
            //create new file and write some data into it

            RandomAccessFile file = new RandomAccessFile("C:\\Users\\Faizan\\IdeaProjects\\Assignments\\src\\day4\\data\\data1.txt","rw");
            file.writeBytes("hello,Wiley!");

            file.seek(0);
            byte[] bytes = new byte[13];
            file.read(bytes);
            String data = new String(bytes);

            System.out.println(data);

            file.seek(7);
            file.writeBytes("java");
        }catch (Exception e){

        }
    }
}
