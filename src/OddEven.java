import java.util.Scanner;

public class OddEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //scanner class to accept user input
        System.out.println("Please enter the number to check if it is odd or even number : ");
        //number will be stored in the variable number
        int number = scanner.nextInt();
        if(number%2==0){ // checking the condition using modulus operator

            System.out.println("Entered number is even number");

        }else
            System.out.println("Entered number is odd number");

    }

}
