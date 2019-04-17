package coreJava;

public class Computer {

    static String keys = "36 keys";
    int year;
    String model;
    String display = "15 inch";

    public Computer() {
    }

    public Computer(int year) {
        this.year = year;
        System.out.println(year);
    }

    public Computer(String model) {
        this.model = model;
        System.out.println(model);
    }


}
