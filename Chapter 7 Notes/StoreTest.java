import java.util.ArrayList;
import java.util.Scanner;
/**
 * A class to test the store class
 *
 * @author jcheng3
 * @version 10 January 2020
 */
public class StoreTest
{
    public static void main (String[] args)
    {
        Scanner s = new Scanner(System.in);
        Store costco = new Store();

        System.out.println("Welcome. Please input the name of the customer, press enter, then input their transaction and press enter.");
        String firstName = s.next();
        double firstSale = s.nextDouble();
        costco.addSale(firstName, firstSale);

        int check = 1;
        while(check == 1)
        {
            System.out.println("Would you like to input another transaction? Enter 1 for yes, and 2 for no.");
            check = s.nextInt();
            if (check == 1)
            {
                System.out.println("Welcome. Please input the name of the customer, press enter, then input their transaction and press enter.");
                String name = s.next();
                double sale = s.nextDouble();
                costco.addSale(name, sale); 
            }
        }

        System.out.println();
        System.out.println();
        System.out.println();
        String topdog = costco.nameOfBestCustomer();
        System.out.println(topdog + " is the top customer of the day!");        
    }
}