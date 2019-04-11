package datastructure;

import java.util.LinkedList;
import java.util.Stack;

public class LinkedListPractice {
    public static void main(String[] args) {

        LinkedList linkedList= new LinkedList();
        linkedList.add("Name");
        linkedList.add("ID");

        System.out.println(linkedList.get(0));
        System.out.println(linkedList);

        Stack stack = new Stack();
        stack.add("ant");
        stack.add("rat");
        System.out.println(stack);
        System.out.println(stack.search("rat"));
        System.out.println(stack.get(0));


    }
}
