package VariablesAndDataTypes;
import java.util.*;
public class AreaCircle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();
       double area = Math.PI * r * r;
       System.out.println(area);
        sc.close();
    }
    
}
