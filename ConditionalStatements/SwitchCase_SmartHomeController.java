package ConditionalStatements;
import java.util.Scanner;
public class SwitchCase_SmartHomeController {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Fan");
        System.out.println("2. Light");
        System.out.println("3. AC");
        System.out.println("4. TV");

        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Fan ON");
                break;

            case 2:
                System.out.println("Light ON");
                break;

            case 3:
                System.out.println("AC ON");
                break;

            case 4:
                System.out.println("TV ON");
                break;

            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
}
}
