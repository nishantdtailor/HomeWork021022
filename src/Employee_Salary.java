import java.text.DecimalFormat;
import java.util.Scanner;

public class Employee_Salary {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the id of the employee : ");
        int id = scanner.nextInt();
        System.out.println("Please enter the name of the employee : ");
        String name = scanner.next();
        System.out.println("Please enter the basic salary of "+name );
        double salary = scanner.nextDouble();

        double hra = salary/10;
        double da = salary/8;
        double ta = salary/9;
        double pf = salary/20;
        double gross_salary = salary+hra+da+ta+pf;

        System.out.println("Here is the salary breakdown for the employee "+name);
        System.out.println("HRA: "+hra);
        System.out.println("DA: "+da);
        System.out.println("TA: "+ta);
        System.out.println("PF: "+pf);
        System.out.println("Gross Salary: "+gross_salary);

   }

}
