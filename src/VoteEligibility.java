import java.util.Scanner;

public class VoteEligibility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the age of the person");
        int age = scanner.nextInt();

        if (age >= 18 ){
            System.out.println("This person is eligible to vote");
        }
        else{

            System.out.println("This person is not eligible to vote");
        }

    }

}
