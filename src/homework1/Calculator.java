package homework1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    private String operation;
    private Scanner scanner;

    public Calculator() {
        this.scanner = new Scanner(System.in);
    }

    public void calculate() {
        while (!"q".equals(operation)) {
            try {
                System.out.println(calculationStep());
            } catch (InputMismatchException ex) {
                System.out.println("Wrong input data!");
            }
        }
    }

    private double calculationStep() throws InputMismatchException {
        System.out.println("enter first number:");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("enter second number:");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("enter operation to perform or q if you want to quit:");

        operation = scanner.nextLine();
        return performOperation(firstNumber, secondNumber);
    }

    private double performOperation(int firstNumber, int secondNumber) {
        return switch (operation) {
            case "+" -> plus(firstNumber, secondNumber);
            case "-" -> minus(firstNumber, secondNumber);
            case "/" -> divide(firstNumber, secondNumber);
            case "*" -> multiply(firstNumber, secondNumber);
            default -> 0;
        };
    }

    private int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private int plus(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    private int minus(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    private double divide(int numberOne, int numberTwo) {
        return (double) numberOne / numberTwo;
    }
}



