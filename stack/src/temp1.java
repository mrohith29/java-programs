import java.util.ArrayList;
import java.util.Stack;
public class temp1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st);
        System.out.println(st.search(6));
        System.out.println(st.empty());
        System.out.println(st.size());
        System.out.println(st.capacity());
        System.out.println(st.contains(2));
        System.out.println(st.get(2));
    }
}
