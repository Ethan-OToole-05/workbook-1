package com.pluralsight;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float input1, input2;
        float result;

        System.out.print("Enter the first number: ");
        input1 = input.nextFloat();
        System.out.print("Enter the second number: ");
        input2 = input.nextFloat();

        result = input1 * input2;

        System.out.println("Possible calculations");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option: M");

        System.out.printf("%.0f" + " * " + "%.0f" + " = " + "%.0f", input1, input2, result);

    }
}
