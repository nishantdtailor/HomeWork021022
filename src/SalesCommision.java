
import java.util.Scanner;

public class SalesCommision {

    public static void main(String[] args) {

        double comm = 0.0;
        double sales = 0.0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Pleas enter the sales id : ");
        int id = scanner.nextInt();

        System.out.println("Please enter seller's name : ");
        String name = scanner.next();

        System.out.println("Please enter the sales amount : ");
        sales = scanner.nextDouble();

        System.out.println("Please enter the basic salary : ");
        double baiscsal = scanner.nextDouble();

        System.out.println("Seller "+name+" with sales id "+id+" has done sale of amount "+sales);
        System.out.println("Seller's basic salary is "+baiscsal);


        if (sales >= 50000)
        {
            comm = sales*0.35;

        }
        if (sales < 50000 && sales >= 30000)
        {
            comm = sales*0.20;
                     
        }
        if (sales <30000 && sales >= 20000)
        {
            comm = sales*0.10;

        }
        if (sales < 20000 && sales >= 10000)
        {
            comm = sales*0.05;
        }
        if (sales < 10000)
        {
            comm = (sales*0.02);
        }

        System.out.println("Commission for the employee " +name+ "is :" +comm);


    }


}
