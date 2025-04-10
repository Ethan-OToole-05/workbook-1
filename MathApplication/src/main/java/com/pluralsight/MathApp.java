package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        //Question 1
        int bobSalary, garySalary, highestSalary;
        bobSalary = 100;
        garySalary = 150;
        highestSalary = Math.max(bobSalary, garySalary);

        System.out.println("The highest salary is: " + highestSalary);

        //Question 2
        int carPrice, truckPrice, lowestPrice;
        carPrice = 2000;
        truckPrice = 3000;

        lowestPrice = Math.min(carPrice, truckPrice);

        System.out.println("The lowest price is: " + lowestPrice);

        //Question 3
        double radius, area;
        radius = 7.25;

        area = (3.14)*(Math.pow(radius, 2));

        System.out.println("The area is: " + area);

        //Question 4

        double input = 5.0;

        input = Math.sqrt(input);

        System.out.println(input);

        //Question 5

        int xPoint1 = 5;
        int yPoint1 = 10;
        int xPoint2 = 85;
        int yPoint2 = 50;

        double formula = Math.sqrt(Math.pow(xPoint2 - xPoint1, 2) + Math.pow(yPoint2 - yPoint1, 2));

        System.out.println(formula);

        //Question 6

        double value = -3.8;

        value = Math.abs(value);

        System.out.println(value);

        //Question 7

        double random = Math.random();

        System.out.println(random);
    }
}
