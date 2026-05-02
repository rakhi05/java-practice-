import java.util.*;
public class Arraylist {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
        list.add("mannu");
        list.add("sukhhad");
        list.add("ruu ki shar");
        list.add("Billa");
        list.add("rashi");
        list.add("prateek");
        System.out.println(list);
        list.remove("rashi");
        System.out.println(list);
        list.set(2, "Ruu ki shar");
        System.out.println(list);
    }
    
}
