package Operators;
import java.util.*;
public class Largest_Two_Numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        int max = (a > b) ? a : b;
       System.out.println("Maximum = " +max);
    sc.close();
    }
    
}
