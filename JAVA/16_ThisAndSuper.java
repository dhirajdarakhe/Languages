
class Rectangle {

    int length;
    int breadth;
    int x = 13;

    Rectangle(int length, int breadth) {
        this.length = length;  /// this is must here
        this.breadth = breadth;
    }

    void Display() {
        System.out.println("Length = " + this.length);
        System.out.println("Breadth = " + this.breadth);
    }
}

class Cuboid extends Rectangle {
    int height;
    int x = 12;

    Cuboid(int l, int b, int h) {
        super(l, b);
        height = h;
    }

    void Display() {
        super.Display();
        System.out.println(super.x);
        System.out.println(x);
    }
}

public class thisANDsuper {
    public static void main(String[] args) {
        Cuboid r1 = new Cuboid(1, 2, 3);
        r1.Display();
    }
}