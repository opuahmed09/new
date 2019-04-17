package sortingAlgorithm;

import java.util.Random;

public class BubbleSortPractice {
    long executionTime = 0;

    public static void main(String[] args) {
        int[] ArrayNumber = new int[1000];
        Random random = new Random();
        for (int x = 0; x < ArrayNumber.length; x++) {
            ArrayNumber[x] = random.nextInt(1000);
        }
        BubbleSortPractice bubbleSortPractice = new BubbleSortPractice();
        bubbleSortPractice.bubbleSortMethod(ArrayNumber);
        System.out.print("Sorted Array : ");
        for (int a = 0; a < ArrayNumber.length; a++) {
            System.out.print(ArrayNumber[a] + " ");
        }

        System.out.println();
        System.out.println("Execution Time : " + bubbleSortPractice.executionTime);
    }

    public void bubbleSortMethod(int array[]) {

        final long startTime = System.currentTimeMillis();
        int n = array.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (array[j] > array[j + 1]) {
                    //swap array[j+1] with array [j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
    }
}
