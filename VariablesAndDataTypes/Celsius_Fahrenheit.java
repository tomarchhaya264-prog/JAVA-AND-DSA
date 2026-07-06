package VariablesAndDataTypes;

import java.util.Scanner;

public class Celsius_Fahrenheit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter celsius: ");
        double celsius = sc.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println(fahrenheit);
        sc.close();
    }
    
}
