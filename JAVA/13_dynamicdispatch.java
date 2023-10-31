
class Super {
   protected void Display() {
        System.out.println("Display method of Super parent");
    }
    void SuperMethod() {
        System.out.println("SuperMethod");
    }
}

class Sub extends Super {
    @Override /// not compulsory to write @Override
     protected void Display() { /// this is overriden method
        System.out.println("Display method of Sub class");
        // super.Display();
    }

    void Display(int t) { /// this is not overriden method
        System.out.println("Display method of Sub class");
        // super.Display();
    }

    void SubMethod() {
        System.out.println("SubMethod");
    }
}

public class dynamicdispatch {
    public static void main(String[] args) {
     Super sp = new Sub();
 
    }
}
