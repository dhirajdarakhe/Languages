
// class Circle {
//     public double radius;
//     public double area() {
//         return Math.PI * radius * radius;
//     }
// }

// class Cylinder extends Circle {
//     public double height;
//     public double area_of_cylinder() {
//         return area() * height;
//     }
// }

// public class inheritance {
//     public static void main(String[] args) {
//         Circle c = new Circle();
//         c.radius = 7;
//         Cylinder c2 = new Cylinder();
//         c2.radius = 7;
//         c2.height = 10;
//         System.out.println(c2.area_of_cylinder());
//     }
// }


class parent {
    public parent(){
         System.out.println("non-param of Parent");
     }
     public parent(int t){
        System.out.println("param of Parent "+t);
    }
}
class Child extends parent {
    public Child(){
        System.out.println("non-param of Child");
    }
   public Child(int t, int g){
  
        super(t);
       System.out.println("param of Child  "+g);
   }
}
public class inheritance {
    public static void main(String[] args) {
        Child c1 =new Child(23,45);
        
    }
}