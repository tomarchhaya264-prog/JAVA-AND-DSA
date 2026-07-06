package VariablesAndDataTypes;

public class Compound_Interest {
    public static void main(String[] args){
        double principal = 10000;
        double rate = 5;
        double time = 2;
        double amount = principal * Math.pow((1 + rate / 100), time);
        double ci = amount - principal;

        System.out.println("Compound Interest = " + ci);
    }
    
}
