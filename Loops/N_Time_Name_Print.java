package Loops;
import java.util.*;
public class N_Time_Name_Print {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Name:");
        String Name = sc.nextLine();
        System.out.println("How many time Print?");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println(i + ". " + Name);
        }
        sc.close();
    }
}
