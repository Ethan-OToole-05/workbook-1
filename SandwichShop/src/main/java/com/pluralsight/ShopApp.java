package com.pluralsight;


import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float regularPrice = 5.45f;
        float largePrice = 8.95f;
        float total = 0;
        float totalDiscount = 0;
        char option, loadedOption;
        int age;

        System.out.println("Welcome to the sandwich shop! ");
        System.out.print("Would you like a (R)egular sandwich or a (L)arge sandwich? ");
        option = input.next().charAt(0);
        option = Character.toUpperCase(option);
        System.out.print("Would you like the sandwich loaded? (Y/N): ");
        loadedOption = input.next().charAt(0);
        loadedOption = Character.toUpperCase(loadedOption);
        if(option == 'R'){
            if(loadedOption == 'Y'){
                total = 5.45f + 1.00f;
            } else {
                total = 5.45f;
            }
        } else if (option == 'L') {
            if(loadedOption == 'Y') {
                total = 8.95f + 1.75f;
            } else {
                total = 8.95f;
            }
        }
        else {
            System.out.println("Invalid input");
        }

        System.out.print("How old are you? ");
        age = input.nextInt();

        if (age <= 17) {
            totalDiscount = total * 0.10f;
            total = total - totalDiscount;
        }
        else if(age >= 65) {
            totalDiscount = total * 0.20f;
            total = total - totalDiscount;
        }
        else {
            System.out.println("Invalid age");
        }

        System.out.printf("Thank you. Your total is: $%.2f", total);

    }
}
