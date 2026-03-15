class Excftry{
    public statis void main(String[] args){
        int a=10;
        int b=0;
        try{
            int c=a/b;
            System.out.println(c);
        }
        finally{
            System.out.println("division is possible");
        }
    }
}