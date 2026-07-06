package Operators;
import java.util.*;
public class Bitwise_Operator { 
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.println("Bitwise AND (&) = " + (a & b));
        System.out.println("Bitwise OR (|) = " + (a | b));
        System.out.println("Bitwise XOR (^) = " + (a ^ b));
        System.out.println("Bitwise NOT (~a) = " + (~a));
        System.out.println("Bitwise NOT (~b) = " + (~b));
    sc.close();
    }
}
