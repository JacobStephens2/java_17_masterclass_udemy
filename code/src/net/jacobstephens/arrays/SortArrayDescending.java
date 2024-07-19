package net.jacobstephens.arrays;

import java.util.Arrays;
import java.util.Random;

public class SortArrayDescending {
    public SortArrayDescending() {
        int[] array = new int[5];
        Random random = new Random();
        for (int i=0; i < array.length; i++) {
            array[i] = random.nextInt(1000);
        }
        System.out.println("Array before sorting: " + Arrays.toString(array));
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int positionOne = 0; positionOne < array.length; positionOne++) {
                int positionTwo = positionOne + 1;
                if (positionTwo > array.length - 1) {
                    break;
                }
                // 1, 2
                if (array[positionTwo] > array[positionOne]) {
                    flag = true;
                    // swap position one and two
                    int positionOneValue = array[positionOne];
                    int positionTwoValue = array[positionTwo];
                    array[positionOne] = positionTwoValue;
                    array[positionTwo] = positionOneValue;
                }
            }
        }
        System.out.println("Array after sorting:  " + Arrays.toString(array));
    }
}
