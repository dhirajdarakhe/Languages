public class veriable_argument {
    static int max(int... x) {
        int a = 0;
        for (int x1 : x) {
            if (a < x1) {
                a = x1;
            }
        }
        return a;
    }

    static int sum(int... x) {
        int a = 0;
        for (int x1 : x) {
            a += x1;
        }
        return a;
    }

    public static void main(String... args) {
        System.out.println(max(1, 3, 24, 3, 244, 3, 44, 14));
        System.out.println(sum(1, 3, 24, 3, 244, 3, 44, 14));
    }
}
