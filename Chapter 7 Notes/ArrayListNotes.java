import java.util.ArrayList;

/**
 * Write a description of class ArrayListNotes here.
 *
 * @author jcheng3
 * @version 7 January 2020
 */
public class ArrayListNotes
{
    public static void main(String[] args)
    {
        /*
         * The ArrayList class is a Java Generic.
         * 
         * We have to specify the type of the elements in the list in angle brackets 
         *      (i.e., ,.) after every ArrayList identifier.
         * 
         * Primitives (e.g., int, double, boolean) are NOT classes. 
         *      They cannot be specified as the type of the elements in a Generic.
         *      Use the Wrapper Class (e.g., Integer, Double, Boolean).
         */
        ArrayList<Integer> myList;
        myList = createRandomIntegerList(10, 20);
        System.out.println(myList);
        removeEvens(myList);
        System.out.println(myList);
        System.out.println(sumList(myList));
    }

    /**
     * Creates and returns a reference to an ArrayList of the specified number
     *      of Integers where each element is assigned a random value between
     *      1 and the specified range.
     * 
     * @param size      the number of Integers to add to the list
     * @param range     the range of random values to assign to each element [1, range]
     * @return a reference to a newly created and initialized list
     */
    public static ArrayList<Integer> createRandomIntegerList(int size, int range)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int i = 0; i < size; i++)
        {
            int value = (int)(Math.random() * range) + 1;

            /*
             * The add method adds the specified object to the end of the list.
             * 
             * Autoboxing:
             *      Primitive values are automatically converted to their corresponding
             *      wrapper class. However, type promotion does not occur.
             */
            list.add(value);
        }

        return list;
    }

    /**
     * Removes even numbers from the specified list.
     * 
     * @param list      the list of numbers to potentially remove
     */
    public static void removeEvens(ArrayList<Integer> list)
    {
        /*
         * The size method returns the number of elements in the list.
         */ 
        for(int i = 0; i < list.size(); i++)
        {
            /*
             * The get method returns the value of the element at the specified index.
             */
            if( list.get(i) % 2 == 0)          
            {
                /*
                 * The remove method deletes the element at the specified index from the list.
                 * All subsequent elements are "shifted left".
                 */
                list.remove(i);
                i--;
            }
        }
    }

    /**
     * Removes even numbers from the specified list.
     * 
     * @param list      the list of numbers to potentially remove
     */
    public static void removeEvensAlt(ArrayList<Integer> list)
    {for(int i = list.size() - 1; i >= 0; i--)
        {
            if( list.get(i) % 2 == 0)          
            {
                list.remove(i);
            }
        }
    }

    /**
     * Adds up an ArrayList<Integer>
     * 
     * @param list      the list we are adding up
     * @return the sum of the list
     */
    public static int sumList(ArrayList<Integer> list)
    {
        int sum = 0;

        /*
         * Enhanced for loops support iterating through ArrayLists.
         * 
         * Similarly to arrays, you cannot modify the list itself in the context of
         *      the enchanced for loops. If you do, a ConcurrentModificationException will be generated.
         */
        for(int value : list)
        {
            sum += value;
        }

        return sum;
    }
}