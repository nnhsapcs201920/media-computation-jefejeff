import java.util.ArrayList;
/**
 * A class where you can manage and keep track of the customers in a store
 *
 * @author jcheng3
 * @version 1 January 2020
 */
public class Store
{
    private ArrayList<Customer> list;

    /**
     * Constructor for objects of class Store
     */
    public Store()
    {
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
        double max;
        String bestCust = "";
        return bestCust;
    }
}
