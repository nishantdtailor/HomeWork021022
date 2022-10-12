import java.util.Scanner;

public class CityNames {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any character : ");
        char city = scanner.next().charAt(0);

        switch (city) {

            case 'a':
            case 'A':
                System.out.println("Amasterdam");
                break;
            case 'b':
            case 'B':
                System.out.println("Barcelona");
                break;
            case 'c':
            case 'C':
                System.out.println("Chicago");
                break;
            case 'd':
            case 'D':
                System.out.println("Dubai");
                break;
            case 'e':
            case 'E':
                System.out.println("Edinburgh");
                break;
            case 'f':
            case 'F':
                System.out.println("Frankfurt");
                break;

            default:
                System.out.println("Invalid character");

        }

    }
}