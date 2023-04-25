package day4;

import java.io.*;

public class DataStreamClass {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fout = new FileOutputStream("C:\\Users\\Faizan\\IdeaProjects\\Assignments\\src\\day4\\data\\data1.txt");
//        DataOutputStream dos = new DataOutputStream(fout);
//
//        dos.writeBytes("I am a programmer");
//        dos.flush();
//        dos.close();

        FileInputStream fin = new FileInputStream("C:\\Users\\Faizan\\IdeaProjects\\Assignments\\src\\day4\\data\\data1.txt");
        DataInputStream dis = new DataInputStream(fin);

        int count  =fin.available();
        byte[] ba = new byte[count];
        dis.read(ba);
        for(byte b :ba){
            System.out.print((char)b);
        }
        dis.close();
        fin.close();
    }
}
