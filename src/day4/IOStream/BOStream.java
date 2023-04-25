package day4.IOStream;

import java.io.*;

public class BOStream {
    public static void main(String[] args) throws IOException {
//        FileOutputStream fout = new FileOutputStream("C:\\Users\\Faizan\\IdeaProjects\\Assignments\\src\\day4\\data\\data1.txt");
//        BufferedOutputStream bof = new BufferedOutputStream(fout);

//        String str = "I am a programmer";
//
//        byte b[] = str.getBytes();
//
//        try {
//            bof.write(b);
//            bof.flush();
//            bof.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        FileInputStream fin = new FileInputStream("C:\\Users\\Faizan\\IdeaProjects\\Assignments\\src\\day4\\data\\data1.txt");
//        BufferedInputStream bin  = new BufferedInputStream(fin);

        try{
            FileInputStream fin = new FileInputStream("C:\\Users\\Faizan\\IdeaProjects\\Assignments\\src\\day4\\data\\data1.txt");
            BufferedInputStream bin  = new BufferedInputStream(fin);
            int i;
            while((i = bin.read())!=-1){
                System.out.print((char)i);
            }
            bin.close();
            fin.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
