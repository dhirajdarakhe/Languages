import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String... args) {
        // Creating an ArrayList with an initial capacity of 20
        ArrayList<Integer> al1 = new ArrayList<>(20);

        // Creating another ArrayList with specified elements using List.of
        ArrayList<Integer> al2 = new ArrayList<>(List.of(10, 20, 30));

        // Adding an element to al1
        al1.add(10);

        // Adding an element at a specific index in al1
        al1.add(0, 5);

        // Adding all elements from al2 to al1
        al1.addAll(al2);

        // Adding all elements from al2 at a specific index in al1
        al1.addAll(3, al2);

        // Uncommenting any of the following lines will result in errors or specific outputs
        // al1.add(23, 89); // This would result in a java.lang.IndexOutOfBoundsException
        // System.out.println(al1.contains(36)); // This prints 'false'

        // Retrieving and printing specific elements and indices
        // System.out.println(al1.get(0)); // Prints '5'
        // System.out.println(al1.indexOf(10)); // Prints '0'
        // System.out.println(al1.indexOf(210)); // Prints '-1'

        // Modifying an element at a specific index
        // al1.set(0, 12);
        // System.out.println(al1.get(0)); // Prints '12'

        // Uncommenting this line would result in an error
        // ArrayList<Integer> al3 = al1.subList(1, 3); // This would result in an error

        // Iterating through the ArrayList using different methods

        // 1. Using a for loop
        // for (int i = 0; i < al1.size(); ++i) {
        //     System.out.print(al1.get(i));
        // }

        // 2. Using an enhanced for loop (for-each loop)
        // for (Integer i : al1) {
        //     System.out.println(i);
        // }

        // 3. Using the forEach method and lambda function
        al1.forEach(n -> System.out.println(n));

        // 4. Using an Iterator
        // Iterator<Integer> it = al1.iterator();
        // while (it.hasNext()) {
        //     System.out.println(it.next());
        // }

        // 5. ListIterator (allows bidirectional iteration) can be used for more advanced scenarios.
    }
}
