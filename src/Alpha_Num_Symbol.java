
import java.util.Scanner;

public class Alpha_Num_Symbol {




        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter any character : ");
            char ch = scanner.next().charAt(0);

            if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {

                System.out.println(ch + " is an Alphabet.");

            } else if(ch >= '0' && ch <= '9') {

                System.out.println(ch + " is a Number.");

            } else {

                System.out.println(ch + " is a Symbol");
            }

        }
}
