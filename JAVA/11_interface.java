

// // 1 )

// interface Test1 {
//     // Test1(){
//     // }
//     void meth1();
//     void meth2();
// }
// // abstract class Test2 implements Test1{
// // } no error if we want to remain it as it is

// class Test2 implements Test1 {
//     public void meth1() {
//         System.out.println("Meth1 of test1");
//     }
//     public void meth2() {
//         System.out.println("Meth2 of test1");
//     }
//     public void meth3() {
//         System.out.println("Meth3 of test1");
//     }
// }

// public class interface_ {
//     public static void main(String[] args) {
//         Test1 t1 = new Test2();
//         t1.meth1();   /// here  we are achieving dynamc method dispatch
//         t1.meth2();   /// here  we are achieving dynamc method dispatch
//         // t1.meth3();
//     }
// }



/// 2 )


// class Test2 implements Test1 {
//     public void meth1() {
//         System.out.println("Meth1 of test2");
//     }

//     public void meth2() {
//         System.out.println("Meth2 of test1");

//     }


// }

// public class interface_ {
//     public static void main(String[] args) {
//         Test1 t1 = new Test2();
//         t1.meth1();
//         t1.meth2();   /// here  we are achieving dynamc method dispatch
//     }
// }


// 3)
