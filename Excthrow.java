class Excthrow{
    public static void main(String[] args){
        int age =15;
        if(age<18){
            throw new ArithmeticException("not eligible");
        }
        System.out.println("eligible");
    }
}