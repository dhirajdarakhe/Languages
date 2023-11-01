public class x_static_block {
    static {
        System.out.println("Dhiraj1");
    }

    public static void main(String[] arg) {
        Demo x1 = new Demo();
        x1.mmm();
        Demo x2 = new Demo();
    }

    static {
        System.out.println("Dhiraj2");
    }
}

class Demo {
    static {
        System.out.println("Dhirajqqqq");
    }

    static {
        System.out.println("Dhirajwwww");
    }

    Demo() {
        System.out.println("constructor");
    }

    void mmm() {
        System.out.println("method");
    }
}

//output

// Dhiraj1
// Dhiraj2    
// Dhirajqqqq 
// Dhirajwwww 
// constructor
// method     
// constructor