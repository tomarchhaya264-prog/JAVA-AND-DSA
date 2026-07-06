package Operators;
import java.util.*;
public class Shift_Operators {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        System.out.println("Original Number = " + num);
        System.out.println("Left Shift (num << 1) = " + (num << 1));
        System.out.println("Right Shift (num >> 1) = " + (num >> 1));
      sc.close();
    }
}
    

