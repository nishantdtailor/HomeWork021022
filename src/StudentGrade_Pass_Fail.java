import java.util.Scanner;


public class StudentGrade_Pass_Fail
{


    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the name of the student : ");
        String name = scanner.nextLine();
        System.out.println("Please enter the roll number of the student : ");
        int rollnum = scanner.nextInt();
        System.out.println("Please enter the marks of the Subject 1 : ");
        int marks1 = scanner.nextInt();
        System.out.println("Please enter the marks of the Subject 2 : ");
        int marks2 = scanner.nextInt();
        System.out.println("Please enter the marks of the Subject 3 : ");
        int marks3 = scanner.nextInt();

        int total = marks1+marks2+marks3;
        double percentage = total/3;

        System.out.println("Name of the Student : " +name+ ", Roll Number : "+rollnum+ ", Percentage : "+percentage);

        if (marks1<35 || marks2<35 || marks3<35)
        {
            System.out.println("Student " + name + " is Failed !!");
        }

        else if (percentage>=80 && percentage<=100)
        {
                System.out.println("Student "+name+ " has achieved A+ grade");
        }
        else if (percentage>=60 && percentage<80)
        {
                System.out.println("Student "+name+ " has achieved A grade");
        }
        else if (percentage>=50 && percentage<60)
        {
                System.out.println("Student "+name+ " has achieved B grade");
        }
        else if (percentage>=35 && percentage<50)
        {
                System.out.println("Student "+name+ " has achieved C grade");
        }
        else
        {
                System.out.println("Student "+name+ " is Failed !!!");
        }
    }
}








