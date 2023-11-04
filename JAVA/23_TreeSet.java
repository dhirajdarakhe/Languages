import java.util.*;

public class x_TreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < 6; ++i) {
            int x = cin.nextInt();
            ts.add(x);
        }
        for (var i : ts) {
            System.out.println(i);
        }
       
        ts.remove(10);
    }
}
