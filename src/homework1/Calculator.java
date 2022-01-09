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
                System.out.println("Result: " + calculationStep());
            } catch (InputMismatchException | NumberFormatException ex) {
                System.out.println("Wrong input data!");
            }
        }
    }

    private double calculationStep() {
        System.out.println("enter first number:");
        double firstNumber = Double.parseDouble(scanner.nextLine());

        System.out.println("enter second number:");
        double secondNumber = Double.parseDouble(scanner.nextLine());

        System.out.println("enter operation to perform or q if you want to quit:");
        operation = scanner.nextLine();
        return performOperation(firstNumber, secondNumber);
    }


    private double performOperation(double firstNumber, double secondNumber) {
        double result;
        switch (operation) {
            case "+":
                result = plus(firstNumber, secondNumber);
                break;
            case "-":
                result = minus(firstNumber, secondNumber);
                break;
            case "/":
                result = divide(firstNumber, secondNumber);
                break;
            case "*":
                result = multiply(firstNumber, secondNumber);
                break;
            default:
                result = 0;
                break;
        }
        return result;
    }

    private double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    private double plus(double numberOne, double numberTwo) {
        return numberOne + numberTwo;
    }

    private double minus(double numberOne, double numberTwo) {
        return numberOne - numberTwo;
    }

    private double divide(double numberOne, double numberTwo) {
        return numberOne / numberTwo;
    }
}




