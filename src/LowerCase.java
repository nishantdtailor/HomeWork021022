import java.util.Scanner;

public class LowerCase {

    public static void main(String[] args) {

        System.out.print("Enter the character:");

        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toCharArray();

        for (char c : input) {
            char lower1 = Character.toLowerCase(c);

            System.out.println("The character " + c + " is converted in the lowercase as: " + lower1);

        }


    }
}
