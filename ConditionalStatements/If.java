package ConditionalStatements;

import java.util.Scanner;

public class If {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Amount");
       double Amount = sc.nextDouble();
       if(Amount > 1000){
        System.out.println("Free Delivery Available");
       } 
       sc.close();
    }
    
}
