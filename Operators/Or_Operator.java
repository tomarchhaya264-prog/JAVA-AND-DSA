package Operators;
import java.util.*;
public class Or_Operator {
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int age = sc.nextInt();
        boolean citizen = true;

        System.out.println(age >= 18 && citizen);
        sc.close();
    }
}
    

