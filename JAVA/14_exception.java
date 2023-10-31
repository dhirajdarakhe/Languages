
// public class exception {
//     public static void main(String[] args) {
//         int a = 0, b = 10, c;
//         int ar[] = { 1, 2 };
//         try {
//             System.out.println(b / a); // here exception is catched ,so instruction after this line won't excute
//                                        // further
//             System.out.println(ar[10]);
//         } catch (ArrayIndexOutOfBoundsException a1) {
//             System.out.println("Array");
//         } catch (ArithmeticException a1) {
//             System.out.println("Division");
//         }
//     }
// }

// both exception will be executed
// public class exception {
//     public static void main(String[] args) {
//         int a = 0, b = 10, c;
//         int ar[] = { 1, 2 };
//         try {
//             try {
//                 System.out.println(b / a);
//             } catch (ArithmeticException a1) {
//                 System.out.println("Division");
//             }
//             System.out.println(ar[10]);
//         } catch (ArrayIndexOutOfBoundsException a1) {
//             System.out.println("Array");
//         }
//     }
// }

// userdefine excetion class
// import java.util.*;
// class MinbalancedException extends Exception {
//     public String toString() {
//         return "you can't withdraw the money";
//     }
// }
// public class exception {
//     public static void main(String[] args) {
//         try {
//          throw new MinbalancedException();
//         } catch (MinbalancedException a1) {
//             System.out.println(a1);
//         }
//     }
// }
