package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PayrollCalcApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        float hoursWorked, payRate, result;

        System.out.print("Enter your name please: ");
        name = input.nextLine();

        System.out.print("Enter your hours worked: ");
        hoursWorked = input.nextFloat();

        System.out.print("Enter your pay rate: ");
        payRate = input.nextFloat();

        result = hoursWorked * payRate;

        System.out.printf("%s " + "your gross pay is: " + "%.2f", name, result);
        
    }
}
