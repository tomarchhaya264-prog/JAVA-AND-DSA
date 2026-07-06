package ConditionalStatements;

import java.util.Scanner;

public class Ifelse_Ticket {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter Age: ");
        int Age = sc.nextInt();
        if(Age >= 13){
            System.out.println("Entry Allowed");
        }
        else{
            System.out.println("Entry Not Allowed");
        }
        sc.close();
    }
}
