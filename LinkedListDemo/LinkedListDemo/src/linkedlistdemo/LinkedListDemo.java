package linkedlistdemo;

public class LinkedListDemo
{

    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(7);
        st.push(15);
        st.push(70);
        st.push(3);
        System.out.println("Poped = "+ st.pop());
        st.push(11);
        st.print();
    }

}
