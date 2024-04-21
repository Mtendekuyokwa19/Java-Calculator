package org.example;


import mathematicalFunctions.Numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Numbers calculator=new Numbers();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter firstnumber");
        calculator.setFirstNumber(input.nextFloat());
        System.out.println("Enter secondNumber");
        calculator.setSecondNumber(input.nextFloat());
        System.out.println("Enter operation");
        calculator.setOperation(input.next());

        System.out.println(calculator.runOperation());


    }
}