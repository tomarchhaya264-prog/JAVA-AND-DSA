package Operators;
import java.util.*;
public class Check_Leap_Year {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year:");
        int year = sc.nextInt();
boolean leap =(year % 400 == 0) ||(year % 4 == 0 && year % 100 != 0);

System.out.println(leap);
        sc.close();
    }
}
