import java.io.*;
public class Wbuffer{
    public static void main(String[] args) throws IOException{
        BufferedWriter bw = new BufferedWriter(new FileWriter("input.txt"));

        bw.write("welcome to java programming");
        bw.close();
    }
}