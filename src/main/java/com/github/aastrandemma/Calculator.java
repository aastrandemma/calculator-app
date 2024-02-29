package com.github.aastrandemma;

import java.util.Scanner;

public class Calculator {
    public static void displayCalculator() {
        System.out.println("CALCULATOR");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
        System.out.println("Choose calculation method: ");
        getInputCalculation();
    }

    public static void getInputCalculation() {
        Scanner scanner = new Scanner(System.in);
        int calculationMethod = scanner.nextInt();

        switch (calculationMethod) {
            case 1:
                getAddition();
                break;
            case 2:
                getSubtraction();
                break;
            case 3:
                getMultiplication();
                break;
            case 4:
                getDivision();
                break;
            case 5:
                System.out.println("\nExiting.");
                break;
            default:
                continueCalculator();
        }
        scanner.close();
    }

    public static int getFirstInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        return scanner.nextInt();
    }

    public static int getSecondInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter second number: ");
        return scanner.nextInt();
    }

    public static void getAddition() {
        System.out.println("\nAddition");
        int first = getFirstInput();
        int second = getSecondInput();
        int result = Calculation.addition(first,second);
        System.out.println(first + " + " + second + " = " + result + "\n");
        continueCalculator();
    }

    public static void getSubtraction() {
        System.out.println("\nSubtraction");
        int first = getFirstInput();
        int second = getSecondInput();
        int result = Calculation.subtraction(first,second);
        System.out.println(first + " - " + second + " = " + result + "\n");
        continueCalculator();
    }

    public static void getMultiplication() {
        System.out.println("\nMultiplication");
        int first = getFirstInput();
        int second = getSecondInput();
        int result = Calculation.multiplication(first,second);
        System.out.println(first + " * " + second + " = " + result + "\n");
        continueCalculator();
    }

    public static void getDivision() {
        System.out.println("\nDivision");
        int first = getFirstInput();
        int second = getSecondInput();
        float result = Calculation.division(first,second);
        System.out.println(first + " / " + second + " = " + result + "\n");
        continueCalculator();
    }

    public static void continueCalculator() {
        System.out.println("Choose a calculation method between 1-4 or exit calculator with 5:");
        getInputCalculation();
    }
}