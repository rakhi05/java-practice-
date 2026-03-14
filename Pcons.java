class Cons{
    int id;
    int year;
    String name;

    Cons(int i, int y, String n){
        id=i;
        year=y;
        name=n;
    }void display(){
        System.out.println(id+" "+year+" "+name);
    }
    public static void main(String[] args){
        Cons obj =new Cons (55, 2, "Mannu");
        obj.display();
    }
}