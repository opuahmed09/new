package extendedClass;

import java.util.LinkedList;
import java.util.Queue;

public class USeOfQueue {

    public static void main(String[] args) {

        /**
         *   FIFO__First in First Out
         */

        Queue<String> qu = new LinkedList<>();
        qu.add("NY");
        qu.add("fl");
        qu.add("TX");
        qu.add("Ca");

        System.out.println(qu.peek());
        System.out.println(qu.remove());
        System.out.println(qu.peek());


    }


}
