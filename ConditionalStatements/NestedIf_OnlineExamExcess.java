package ConditionalStatements;

import java.util.Scanner;

public class NestedIf_OnlineExamExcess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Registered? (true/false): ");
        boolean registered = sc.nextBoolean();

        if(registered) {

            System.out.print("Fees Paid? (true/false): ");
            boolean feesPaid = sc.nextBoolean();

            if(feesPaid) {
                System.out.println("Exam Access Granted");
            } else {
                System.out.println("Pay Fees First");
            }

        } else {
            System.out.println("Registration Required");
        }
         sc.close();
    }
}

