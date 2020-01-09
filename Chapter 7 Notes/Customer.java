/**
 * A class to track the customers of a store
 *
 * @author jcheng3
 * @version 1 January 2020
 */
public class Customer
{
    private String customer;
    private double sale;
    /**
     * Constructor for objects of class Customer
     * 
     * @param name      the name of the customer
     * @param amount    the price of the transaction
     */
    public Customer(String name, double amount)
    {
        customer = name;
        sale = amount;
    }

    /**
     * A method to get the name of a customer
     *
     * @return customer     the name of the customer
     */
    public String getName()
    {
        return customer;
    }

    /**
     * A method to get the cost of a sale
     * 
     * @return sale     the price of the transaction
     */
    public double getSale()
    {
        return sale;
    }
}
