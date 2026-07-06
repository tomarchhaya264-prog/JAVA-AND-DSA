package Operators;
import java.util.*;
public class No_Between_1to100 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();
   System.out.println(num >= 1 && num <= 100);
   sc.close(); 
}
    
}
