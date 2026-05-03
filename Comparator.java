import java.util.ArrayList;
import java.util.Collections;

class Student {
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

class StudentAgeComparator implements java.util.Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.age - s2.age;
    }
}

public class Comparator {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student(22, "mannu"));
        list.add(new Student(21, "annu"));
        Collections.sort(list, new StudentAgeComparator());
        for (Student s : list) {
            System.out.println(s.name + " " + s.age);
        }
    }
}
