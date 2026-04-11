import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Annotation
{
    String name();
    int salary();
}
@Annotation(name = "Rakhi jha", salary = 100000)

class Main
{
    public static void main (String[] args)
    {
        Annotation a = Main.class.getAnnotation (Annotation.class);
        System.out.println (a.name()+" "+a.salary());
    }

}

    

