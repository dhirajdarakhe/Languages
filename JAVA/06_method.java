public class method {

    // *** making max method static

    // static int max(int a,int b){
    // a = 90;
    // return a>b?a:b;
    // }
    // public static void main(String[] args) {
    // int a =9,b =23,c =0;
    // c = max(a,b);
    // System.out.println(a);
    // }

    // *** without making max methos static

    // int max(int a,int b){
    // a = 90;
    // return a>b?a:b;
    // }
    // public static void main(String[] args) {
    // int a =9,b =23,c =0;
    // method mp= new method();
    // c = mp.max(a,b);
    // System.out.println(a);
    // }

    //// ****
    // static void inc(int a) { a ++; }
    // public static void main(String[] args) {
    // int a = 9;
    // System.out.println(a);
    // }

    /// ***
    // static void update(int a[]) {
    // a[0]++;
    // }

    // public static void main(String[] args) {
    // int a[] = { 2, 3, 4 };
    // update(a);
    // System.out.println(a[0]);
    // }

    /// ***
    //
    // static void update(String a) {
    // a = "Dhiraj";
    // }

    // public static void main(String[] args) {
    // String x = "Dhira";
    // update(x);
    // System.out.println(a);

    // }

    // / ***
    // */
    // static String update(String a) {
    // a = "Dhiraj";
    // return a;
    // }
    // public static void main(String[] args) {
    // int a[] = {1,2,3,4};
    // }

    ////////// ****** */

    static void show(int... x) {
        for (int x1 : x) {
            System.out.println(x1);
        }
    }

    public static void main(String ...args) {
        // show();
        // show(1, 2, 3);
        // show(3);
        // show(new int[]{1,2,3,4});/// this is ana function


    }

}
