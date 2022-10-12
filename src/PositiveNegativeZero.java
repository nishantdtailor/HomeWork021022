import java.util.Scanner;

public class PositiveNegativeZero {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the number : ");
        double num = scanner.nextDouble();
        if (num == 0){

            System.out.println("Entered number is zero ");

        } else if (num<0)
        {
            System.out.println("Entered number is negative number");

        } else if (num>0) {

            System.out.println("Entered number is positive number");
        }
        else {

            System.out.println("Invalid Number Entered !!");
        }


    }

}
