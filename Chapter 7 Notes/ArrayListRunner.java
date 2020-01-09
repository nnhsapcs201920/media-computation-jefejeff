import java.util.ArrayList;
/**
 * Working with array lists involves invoking ArrayList methods, so we will need to develop some basic skills.
 *
 * @author hxgu & jcheng3
 * @version 8 jan 2020
 */

public class ArrayListRunner
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);

        // a)  Invoke add() to enter the following names in sequence: Alice, Bob,
        //     Connie, David, Edward, Fran, Gomez, Harry. Print the ArrayList again.
        names.add("Alice");
        names.add("Bob");
        names.add("Connie");
        names.add("David");
        names.add("Edward");
        names.add("Fran");
        names.add("Gomez");
        names.add("Harry");
        System.out.println("a: " + names);
        System.out.println();

        // b) Use get() to retrieve and print the first and last names in the list.
        String first = names.get(0);
        String last = names.get(names.size() - 1);
        System.out.println("b: First Name: " + first + "; " + "Last Name: " + last);
        System.out.println();

        // c) Print the size() of the ArrayList.
        System.out.println("c: Size of ArrayList names: " + names.size());
        System.out.println();

        // d) Use size() to help you print the last name in the list.
        System.out.println("d: Last name in list: " + names.get(names.size() - 1));
        System.out.println();

        // e)  Use set() to change “Alice” to “Alice B. Toklas”. Print the
        //     ArrayList to verify the change.
        names.set(0, "Alice B. Toklas");
        System.out.println("e: " + names);
        System.out.println();

        // f) Use the alternate form of add() to insert “Doug” after
        //    “David”. Print the ArrayList again.
        names.add(4, "Doug");
        System.out.println("f: " + names);
        System.out.println();

        // g) Use an enhanced for loop to print each name in the ArrayList.
        System.out.print("g: [ ");
        for(String name : names)
        {
            System.out.print(name + " ");
        }
        System.out.print("]");
        System.out.println();
        System.out.println();

        // h) Create a second ArrayList called names2 that is built by
        //    calling the ArrayList constructor that accepts another ArrayList
        //    as an argument. Pass names to the constructor to build names2.
        //    Then print the ArrayList.
        ArrayList<String> names2 = new ArrayList<String>(names);
        System.out.println("h: "+ names2);
        System.out.println();

        // i) Call names.remove(0) to remove the first element. Print names and
        //    names2. Verify that Alice B. Toklas was removed from names, nut not names2
        names.remove(0);
        System.out.println("i: " + names + "     " + names2);
    }
}