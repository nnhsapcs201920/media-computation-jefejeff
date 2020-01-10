import java.util.ArrayList;
/**
 * A class where you can manage and keep track of the customers in a store
 *
 * @author jcheng3
 * @version 1 January 2020
 */
public class Store
{
    ArrayList<Customer> list;

    /**
     * Constructor for objects of class Store
     */
    public Store()
    {
        list = new ArrayList<Customer>(0);
    }

    /**
     * A method to track the transactions of customers in the store (record the sale)
     *
     * @param  customerName     the name of the customer
     * @param amount        the cost of the transaction
     */
    public void addSale(String customerName, double amount)
    {
        Customer shopper = new Customer(customerName, amount);
        list.add(shopper);
    }

    /**
     * A method to find top customer in the store
     *
     * @return the customer who spent the most (the largest sale)
     */

    public String nameOfBestCustomer()
    {
        double max = 0.0;
        int index = 0;
        for(int i = 0; i < list.size() - 1; i++)
        {
            if(max < list.get(i).getSale())
            {
                max = list.get(i).getSale();
                index = i;
            }
        }
        String bestCust = list.get(index).getName();
        return bestCust;
    }
}
