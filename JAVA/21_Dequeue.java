import java.util.ArrayDeque;

public class x_Dequeue {

    public static void main(String[] args) {
        ArrayDeque<Integer> st = new ArrayDeque<>();
 
        int p = 0;
        st.offerLast(p);
        p++;
        st.offerLast(p);
        p++;
        st.offerLast(p);
        p++;
        st.offerLast(p);
        p++;
        System.out.println(st);
        st.offerFirst(p);
        p++;
        st.offerFirst(p);
        p++;
        st.offerFirst(p);
        p++;
        st.offerFirst(p);
        p++;
        System.out.println(st);

    }

}
