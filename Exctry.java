class Exctry{
    public static void main(String[] args){
        int a =10;
        int b =0;
        try{
            int c =a/b;
            System.out.println(c);
        }catch(ArithmaticException e){
            System.out.println("division not possible");
        }finally{
            System.out.println("division is Possible");
        }
    }
}