class Cons{
    int id;
    int year;
    String name;

    Cons(){
        id=55;
        year=2;
        name="Mannu";
    }void display(){
        System.out.println(id+" "+year+" "+name);
    }
    public static void main(String[] args){
        Cons obj =new Cons();
        obj.display();
    }
}