import java.util.Comparator;
import java.util.PriorityQueue;

class MyComp implements Comparator<Integer> {
    public int compare(Integer a, Integer b) {
        if (a < b)
            return 1;
        if (a > b)
            return -1;
        return 0;
    }
}

public class x_PriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComp());
        int q = 0;
        pq.offer(q);
        pq.offer(8);
        pq.offer(854);
        pq.offer(78);
        System.out.println(pq);
        pq.poll();
        System.out.println(pq);

    }
}
