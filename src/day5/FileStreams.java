package day5;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileStreams {
    public static void main(String[] args) throws IOException {
        FileOutputStream fout  = new FileOutputStream("C:\\Users\\Faizan\\IdeaProjects\\Assignments\\src\\day4\\data\\practice.txt");

        String str = "Wiley full stack";
        byte[] b = str.getBytes();
        fout.write(b);
        fout.flush();
        fout.close();
    }
}
