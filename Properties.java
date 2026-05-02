import java.util.*;
public class Properties {
    public static void main(String[] args){
        java.util.Properties p = new java.util.Properties();
        p.setProperty("name", "Mannu");
        p.setProperty("city", "Delhi");
        System.out.println(p);
        System.out.println(p.getProperty("name"));
    }
    
}
