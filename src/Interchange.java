import java.util.Scanner;

public class Interchange {

    public static void main(String[] args) {

        int a, b, c;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the Value of A : ");
        a = scanner.nextInt();
        System.out.println("Please enter the Value of B : ");
        b = scanner.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("Interchanged Value of A = "+a+" and B = "+b );


    }

}
