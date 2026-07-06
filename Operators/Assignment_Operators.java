package Operators;
import java.util.*;
public class Assignment_Operators {
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
    a += 5;
    b -= 3;
    c *= 2;
    d /= 4;
   System.out.println("A =" +a);
   System.out.println("B =" +b);
   System.out.println("C =" +c);
   System.out.println("D =" +d);
sc.close();
}
}
