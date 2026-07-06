package Operators;
import java.util.*;
public class Ternary_Operator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
      String ans = (n % 2 == 0) ? "Even" : "Odd";
      System.out.println(ans);
      sc.close();
    }
}
