import java.util.Scanner;


public class Average {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter first number : ");
        int num1 = scanner.nextInt();
        System.out.println("Please enter second number : ");
        int num2 = scanner.nextInt();
        System.out.println("Please enter third number : ");
        int num3 = scanner.nextInt();
        System.out.println("Please enter fourth number : ");
        int num4 = scanner.nextInt();
        System.out.println("Please enter fifth number : ");
        int num5 = scanner.nextInt();

        int avg = (num1+num2+num3+num4+num5)/5;

        System.out.println("Average of all 5 numbers : "+avg);





    }


}
