public interface interfaceshape {
    void draw();
}
 class circle implements interfaceshape{
    public void draw(){
        System.out.println("drawing circle");
    }
 } class rectangle implements interfaceshape{
    public void draw(){
        System.out.println("drawing rectangle");
    }
 } class test1{
    public static void main(String[] args){
        circle c = new circle();
        rectangle r = new rectangle();
        c.draw();
        r.draw();
    }
 }  