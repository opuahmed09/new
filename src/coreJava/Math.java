package coreJava;

public class Math {

    //Static Method - Void
    public static void getTime() {

    }

    //Static Method - Return Type
    public static int calculator2(int a, int b) {
        int total = a / b;
        return total;
    }

    //Non Static Method - Void
    public void getAddress() {
        System.out.println("My Address is .....");
    }

    public void calculator3(int a, int b) {
        int total = a + b;
        System.out.println(total);

    }

    //Non Static Method - Return Type
    public int calculator1(int a, int b) {
        int total = a + b;
        return total;
    }
}
