import java.util.*;

public class x_TreeMap {
    public static void main(String[] args) {
        // TreeMap<Integer, String> mp = new TreeMap<>();
        // Scanner cin = new Scanner(System.in);
        // for(int i =0; i < 5; ++i)
        // {
        // int x = cin.nextInt();
        // String s = cin.nextLine();
        // mp.put(x, s);
        // }
        // System.out.println(mp);

        int[] arr = {1, 2, 3, 2, 1, 3, 4, 5, 4};

        // Create a TreeMap to store the counts
        TreeMap<Integer, Integer> countMap = new TreeMap<>();

        // Count the elements in the array
        for (int element : arr) {
            countMap.put(element, countMap.getOrDefault(element, 0) + 1);
        }

        // Print the counts
        for (int key : countMap.keySet()) {
            System.out.println(key + ": " + countMap.get(key));
        }
    }

}
