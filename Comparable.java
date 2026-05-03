import java.util.Collections;
import java.util.ArrayList;

class Student implements java.lang.Comparable<Student>{
    int age;
    String name;

    public Student(int age,String name){
        this.age=age;
        this.name=name;
    }
    public int compareTo(Student s){
        return this.age-s.age;
    }
}
public class Comparable {
    public static void main(String[] args) {
        
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(22,"mannu"));
        list.add(new Student(21,"annu"));

        Collections.sort(list);
        for(Student s:list){
            System.out.println(s.name+" "+s.age);
        }    }
} 
