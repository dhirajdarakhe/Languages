public class StaticBlockExample {

    static {
        System.out.println("Static Block 1");
    }

    public static void main(String[] args) {
        MyClass instance1 = new MyClass();
        instance1.myMethod();
        MyClass instance2 = new MyClass();
    }

    static {
        System.out.println("Static Block 2");
    }
}

class MyClass {

    static {
        System.out.println("Static Block A");
    }

    static {
        System.out.println("Static Block B");
    }

    MyClass() {
        System.out.println("Constructor");
    }

    void myMethod() {
        System.out.println("Method");
    }
}


// In this code:

// StaticBlockExample is the main class.
// MyClass is the class with a static block, constructor, and a method.
// The output remains the same:
// Static Block 1
// Static Block 2
// Static Block A
// Static Block B
// Constructor
// Method
// Constructor
