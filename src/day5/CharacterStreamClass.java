package day5;

import java.io.*;

public class CharacterStreamClass {
    public static void main(String[] args) throws IOException {
        Writer out = new OutputStreamWriter(System.out);
        Writer fw = new FileWriter("C:\\Users\\Faizan\\IdeaProjects\\Assignments\\src\\day4\\data\\data1.txt");

        BufferedWriter bw = new BufferedWriter(fw);
        bw.flush();
        bw.close();
        fw.close();


        Reader reader  = new InputStreamReader(System.in);
        Reader reader1 = new FileReader("C:\\Users\\Faizan\\IdeaProjects\\Assignments\\src\\day4\\data\\data1.txt");

        BufferedReader br = new BufferedReader(reader1);
        String read = br.readLine();
        byte[] b = read.getBytes();
        int i;
//        int i;
//        while((i = bin.read())!=-1){
//            System.out.print((char)i);
//        }
//        while((i = b.read())!=-1) {
//            System.out.println((char)i);
//        }
    }
}
