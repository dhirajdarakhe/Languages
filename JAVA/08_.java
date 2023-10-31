// class Reactangle {
//     private int length;
//     private int breath;

//     public Reactangle() {
//         length = 12;
//         breath = 12;
//     }

//     public int area() {
//         return length * breath;
//     }
// }

// class Cuboid extends Reactangle {
//     private int height;
//     public Cuboid() {
//         height = 12;
//     }
//     public int area1() {
//         return area() * height;
//     }
// }
// public class construc {
//     public static void main(String[] args) {
//         Cuboid r1 = new Cuboid();
//         System.out.println(r1.area1());
//     }
// }

class Reactangle {
    int length;
    int breath;

    public Reactangle(int l, int b) {
        length = l;
        breath = b;
    }

    public int area() {
        return length * breath;
    }
}

class Cuboid extends Reactangle {
    int height;

    Cuboid(int h, int b, int l) {
        super(l, b);
        height = h;
    }

    int area1() {
        return area() * height;
    }
}

public class construc {
    public static void main(String[] args) {
        Cuboid r1 = new Cuboid(5, 5, 5);
        System.out.println(r1.area1());
    }
}
