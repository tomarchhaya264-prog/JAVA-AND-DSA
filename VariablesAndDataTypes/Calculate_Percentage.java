package VariablesAndDataTypes;

public class Calculate_Percentage {
    public static void main(String[] args){
        int sub1 = 92;
        int sub2 = 90;
        int sub3 = 89;
        int sub4 = 85;
        int sub5 = 80;
        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = (total / 500.0) * 100;

        System.out.println("Percentage = " + percentage + "%");
    }
}
