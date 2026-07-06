package Operators;

import java.util.Scanner;

public class Multiply_Division {
     public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a and b:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = a * b;
        int division = a / b;
       System.out.println("Multiply =" + multiply);
       System.out.println("Division =" +division);
       sc.close();
    }
    
}


