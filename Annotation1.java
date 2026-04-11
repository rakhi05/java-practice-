import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Annotation1
{
    String name();
    int salary();
}
@Annotation1(name = "Rakhi jha", salary = 100000)

 class Test
{
    public static void main (String[] args)
    {
        Annotation1 a = Test.class.getAnnotation (Annotation1.class);
        System.out.println (a.name()+" "+a.salary());
    }
