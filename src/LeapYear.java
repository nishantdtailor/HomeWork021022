import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {

        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter the year : "); // accepting user input as year
        int year = scanner.nextInt();                   // storing value to the variable year

        // checking condition to verify if the entered year is leap year or not
        //There are two condition to check, therefore I have use && as logical operator

        if (year%4==0 && year%100 !=0)

            System.out.println("Year " + year + " is a leap year");
        else
            System.out.println("Year "+year+ " is not a leap year");
    }




}
