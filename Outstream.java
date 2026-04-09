import java.io.*;
public class Outstream {
    public static void main(String[] args) throws IOException{
        int i;
        FileOutputStream out = new FileOutputStream("output.txt");
        String s = "hello\n Jeene ke hai char din\n Jee lo jitna jee sakte ho";
        char ch [] = s.toCharArray();
        for (i=0; i<s.length(); i++)
        out.write(ch[i]);
        out.close();
    }
}
