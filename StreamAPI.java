import java.util.*;
import java.util.stream.*;

public class StreamAPI {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        list.stream().
        map(n -> n * n).
        forEach(System.out::println);

        list.stream().filter(n -> n % 2 == 0).
        sorted().
        forEach(System.out::println);
    }
}    