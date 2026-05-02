import java.util.*;
public class Hashmap {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();
        map.put(1,"Mannu");
        map.put(2,"sukhhad");
        map.put(3,"Ruu ki shar");
        map.put(4,"Billa");
        map.put(5,"prateek");
        System.out.println(map);
        map.remove(5);
        System.out.println(map);
        map.replace(4, "Billa");
        System.out.println(map);
    }
    
}
