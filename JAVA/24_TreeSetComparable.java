import java.util.*;

public class TreeSetComparable {
    public static void main(String[] args) {
        TreeSet<Point> ts = new TreeSet<>();
        ts.add(new Point(1, 2));
        ts.add(new Point(6, 12));
        ts.add(new Point(2, 2));
        ts.add(new Point(3, 2));
        ts.add(new Point(3, 1));
        System.out.println(ts);
    }
}

class Point implements Comparable {
    int x;
    int y;

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public String toString() {
        return "x= " + x + " y=" + y;
    }

    public int compareTo(Object o) {
        Point p = (Point)o;
        if(p.x == this.x && p.y == this.y) return 0;
        if(this.x < p.x) return -1;
        if(this.x == p.x && this.y <= p.y) return -1;
        return 1;
    }

}