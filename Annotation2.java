import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@Repeatable(Employee.class)
public @interface Annotation2 {
    String name();
    int salary();
}

@Retention(RetentionPolicy.RUNTIME)
@interface Employee {
    Annotation2[] value();
}
@Annotation2(name = "Rakhi jha", salary = 400000)
@Annotation2(name = "sahil pathan", salary = 300000)
@Annotation2(name = "Rohan bisht", salary = 200000)
@Annotation2(name = "Rukshar", salary = 100000)

class Main2
{
    public static void Main (String[] args)
    {
        Annotation2[] e = Main2.class.getDeclaredAnnotationsByType(Annotation2.class);
        for(Annotation2 a : e)
        {System.out.println (a.name()+" "+a.salary());
    }
}
}
