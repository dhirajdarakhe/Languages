
class Rectangle {
    public Rectangle() {
        System.out.println("non-para-const-> parent");
    }

    public Rectangle(int len, int g) {
        System.out.println("2-para-const-> parent");
    }
}

class Cuboid extends Rectangle {
    public Cuboid() {
        System.out.println("non-para-const-> child");
    }

    public Cuboid(int hei) {
        System.out.println("1-para-const-> child");
    }

    public Cuboid(int len, int bre, int hei) {
        super(len, hei);
        System.out.println("3-para-const-> child");
    }
}

public class inheritance_with_constuctor {
    public static void main(String[] args) {
        System.out.println("*********");
        Rectangle r1 = new Rectangle();
        System.out.println("*********");
        Rectangle r2 = new Rectangle(2, 56);
        System.out.println("*********");
        Cuboid c1 = new Cuboid();
        System.out.println("*********");
        Cuboid c2 = new Cuboid(2);
        System.out.println("*********");
        Cuboid c3 = new Cuboid(2, 3, 3);
    }
}
// package superconstr;

// class Parent
// {
// Parent()
// {
// System.out.println("Non-Param of parent");
// }
// Parent(int x)
// {
// System.out.println("Param of parent "+x);
// }
// }

// class Child extends Parent
// {
// Child()
// {
// System.out.println("Non-Param of child");
// }
// Child(int y)
// {
// System.out.println("Param of child");
// }
// Child(int x,int y)
// {
// super(x);
// System.out.println("2 param of child "+y);
// }
// }

// public class inheritance_with_constuctor {
// public static void main(String[] args) {
// // Parent p1=new Parent();
// // Parent p2=new Parent(20);
// // Child c=new Child();
// // Child c=new Child(20);
// Child c=new Child(10,20);
// }

// }