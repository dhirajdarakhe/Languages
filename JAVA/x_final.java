public class x_final {
    // final int x;
    // variable x not initialized in the default constructor
    final int x; // is not used in static mthod
    
    x_final() {
        x = 10;
    }

    public static void main(String[] a) {
        x_final obj = new x_final();
    }
}
