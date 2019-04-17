package sortingAlgorithm;

import java.util.Random;

public class SelectionSortPractice {

    long executionTime = 0;

    public void selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();

        for (int i = 0; i < array.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_idx])
                    min_idx = j;
                int temp = array[min_idx];
                array[min_idx] = array[i];
                array[i] = temp;
            }
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
    }

    public static void main(String[] args) {
        int[] ArrayNumber = new int[10];
        Random random = new Random();
        for (int x = 0; x < ArrayNumber.length; x++) {
            ArrayNumber[x] = random.nextInt(1000);
        }
        SelectionSortPractice selectionSortPractice = new SelectionSortPractice();
        selectionSortPractice.selectionSort(ArrayNumber);
        System.out.print("Sorted Array : ");
        for (int a = 0; a < ArrayNumber.length; a++) {
            System.out.print(ArrayNumber[a] + " ");
        }
        System.out.println();
        System.out.println("Execution Time : " + selectionSortPractice.executionTime);
    }

}
