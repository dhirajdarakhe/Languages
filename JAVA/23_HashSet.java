import java.util.HashSet;

public class x_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<Integer>();
        hs.add(12);
        hs.add(34);
        hs.add(56);
        hs.add(34);
        System.out.println(hs);
        hs.remove(34);
        System.out.println(hs);
        System.out.println(hs.contains(10));
    }

}
