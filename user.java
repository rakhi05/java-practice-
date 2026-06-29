// write a java program whish asks the user to enter his/her name and greets them with "hello <name>,
//have a good day" text.

import java.util.Scanner;

public class user {
    public static void main(String[] args){
        System.out.println("what is your name?");
        Scanner sc = new Scanner (System.in);
        String name = sc.next();
        System.out.println("hello " + name + ", have a good day!");
    } 
    
}
