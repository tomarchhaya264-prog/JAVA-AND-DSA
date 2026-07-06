package Operators;
import java.util.*;
public class Increment_Decrement {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Num1:");
       int a = sc.nextInt();
       System.out.println("Enter the Num2:");
       int b = sc.nextInt();
       System.out.println("Enter the Num3:");
       int c = sc.nextInt();
       System.out.println("Enter the Num4:");
       int d = sc.nextInt();

        ++a;    // Pre-increment
        b++;    // Post-increment
        --c;    // Pre-decrement
        d--;    // Post-decrement

        System.out.println("PreIncrement =" +a);
        System.out.println("PostIncrement =" +b);
        System.out.println("PreDecrement =" +c);
        System.out.println("PostDecrement =" +d);
     sc.close();
    }
    
}
