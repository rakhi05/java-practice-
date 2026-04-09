import java.io.*;
public class Intstream {
    public static void main(String[] args) throws IOException{
        int i;
        FileReader fr = new FileReader("input.txt");
        do{
            i=fr.read();
            if(i!=-1){
                System.out.print((char)i);
            }
        }   while(i!=-1);
        fr.close();
    }
    
}
