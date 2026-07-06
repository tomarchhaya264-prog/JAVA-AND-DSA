package ConditionalStatements;

import java.util.Scanner;

public class Elseif_InternetSpeed {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
         System.out.print("Enter Internet Speed");
        int speed = sc.nextInt(); 
          if(speed<10){
            System.out.println("Slow");
            }
            else if(speed<=50){
                System.out.println("Normal");
          }
          else if(speed<=100){
            System.out.println("Fast");
          }
          else{
            System.out.println("Ultra Fast");
          }
         sc.close();
        }
    }
