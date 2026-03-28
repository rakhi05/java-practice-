public abstract class Animalabstract {
    abstract void sound ();    //abstract method 
     
    void eat (){                  //normal method 
        System.out.println("animal eats food");
    }
} 
 class dog extends Animalabstract{
    void sound(){
        System.out.println("dogs barking");
    }
 }
class test {
    public static void main(String [] args){
        dog d = new dog();
        d.sound();
        d.eat();
    }
}