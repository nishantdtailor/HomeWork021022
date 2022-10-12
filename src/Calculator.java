import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        double num1;
        double num2;

        char operator;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number");
        num1 = scanner.nextDouble();

        System.out.println("Please enter the second number");
        num2 = scanner.nextDouble();

        System.out.println("Please enter what operation would you like to perform ? + - * / ");
        operator = scanner.next().charAt(0);

        switch (operator){

            case '+':
                System.out.println("Total for two numbers : "+(num1+num2));
                break;
            case '-':
                System.out.println("Subtraction of two numbers : "+(num1-num2));
                break;
            case '*':
                System.out.println("Multiplication of two numbers : "+(num1*num2));
                break;
            case '/':
                System.out.println("Division of two numbers : "+(num1/num2));
                break;
            default:
                System.out.println("Invalid operation !!");






        }


    }

}
