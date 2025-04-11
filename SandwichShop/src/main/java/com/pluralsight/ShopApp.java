package com.pluralsight;


import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float regularPrice = 5.45f;
        float largePrice = 8.95f;
        float total = 0;
        float totalDiscount = 0;
        char option;
        int age;

        System.out.println("Welcome to the sandwich shop! ");
        System.out.print("Would you like a (R)egular sandwich or a (L)arge sandwich? ");
        option = input.next().charAt(0);
        option = Character.toUpperCase(option);
        if(option == 'R'){
            total = 5.45f;
        } else if (option == 'L') {
            total = 8.95f;
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

        System.out.printf("Thank you. Your total is: $%.2f", total);

    }
}
