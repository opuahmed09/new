package extendedClass;

import java.util.Stack;

public class UseOfStack {

    public static void main(String[] args) {


        /**
         *      FILO __ First in Last Out
         */

        Stack<String> st = new Stack<String>();

        st.add("New York");
        st.add("Florida");
        st.add("California");
        st.add("new Mexico");
        st.add("texas");

        System.out.println(st.peek());
        System.out.println(st.pop());
        System.out.println(st.peek());

    }


}
