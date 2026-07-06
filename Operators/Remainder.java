package Operators;
import java.util.Scanner;
public class Remainder {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b:"); 
        int a = sc.nextInt();
        int b = sc.nextInt();
        int remainder = a % b;
        System.out.println("Remainder = " + remainder);
       sc.close();
    }
    
}


