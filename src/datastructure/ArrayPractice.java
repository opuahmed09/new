package datastructure;

public class ArrayPractice {

    public static void main(String[] args) {

        String[] employeesName = {"Apu", "Adnan"};
        int[] salary = {1000, 2000, 3000};

        int[] Identification = new int[2];
        Identification[0] = 100;
        //Identification[1] = 1000;
        try {
            Identification[1] = 2000;
        } catch (Exception e) {
            System.out.println("exception caught ");
        }
        System.out.println(Identification[1]);
        // row & column
        String multiDimentionalArray[][] = new String[3][3];

        for (int i = 0; i < multiDimentionalArray.length; i++) {
            for (int j = 0; j < multiDimentionalArray.length; j++) {
                multiDimentionalArray[0][1] = "hey";
            }
        }
        System.out.println(multiDimentionalArray[0][1]);

        //Object
        //Can store any datatypes
        Object[] employeesInfo = {"Apu", 10};

        System.out.println(employeesInfo[1]);


    }


}
