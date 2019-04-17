package oop;

public class Polymorphism extends ConcreteCar {
//Method Overloading
    //same method name, different parameters, in same class

    public static void main(String[] args) {
        Polymorphism polymorphism = new Polymorphism();
        polymorphism.calculator(10, 12);
        polymorphism.calculator(10, 12, 2);

        polymorphism.autoHeadLight(11);


    }

    public void calculator(int a, int b) {
        int c = a + b;
        System.out.println(c);
    }

    public void calculator(int a, int b, int d) {
        int c = a + b;
        double g = c / d;
        System.out.println(g);
    }

    //Method Overriding
    //same method name , same parameters, different body, in different class (uses extend)
    @Override
    public void autoHeadLight(int a) {
        System.out.println(a + " headlight --- polymorphism class");

    }

}
