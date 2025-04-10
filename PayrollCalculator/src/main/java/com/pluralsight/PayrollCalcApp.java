package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PayrollCalcApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name;
        float hoursWorked, payRate, overtimeHours, overtimePayTotal;
        float result = 0;
        System.out.print("Enter your name please: ");
        name = input.nextLine();

        System.out.print("Enter your hours worked: ");
        hoursWorked = input.nextFloat();

        System.out.print("Enter your pay rate: ");
        payRate = input.nextFloat();

        if(hoursWorked > 40)
        {
            //Calculates overtime pay first than calculates normal hours worked after.
            overtimeHours = hoursWorked - 40;
            overtimePayTotal = overtimeHours * (payRate * 1.5f);
            result = (hoursWorked - overtimeHours) * payRate + overtimePayTotal;
        }
        else
        {
            //No overtime will just have a result.
            result = hoursWorked * payRate;
        }

        System.out.printf("%s " + "your gross pay is: " + "$%.2f", name, result);

    }
}
