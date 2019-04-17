package coreJava;

public class Comparison {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        int c = 7;
        int d = 8;


        //if a = b
        //print a is equal to b
        if (a == b)
            System.out.println("a is equal to b");

        //if a is not = b
        //print a is not equal to b

        if (c != d)
            System.out.println("c is not equal to d");

        //if a is greater than b
        //print a is greater than b

        if (a > b)
            System.out.println("a is greater than b");

        //if a is less than c
        //print a is less than c

        if (c < a)
            System.out.println("c is less than a");

        //if a = b
        //print a is equal to b
        //else a is not = b
        //print a is not equal to b

        if (a == b) {
            System.out.println("new : a is equal to b");
        } else {
            System.out.println("new : a is not equal to b");
        }
    }

}
