package net.jacobstephens.arrays;

import java.util.Arrays;

public class ReverseArray {
    public ReverseArray() {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        reverse(array);
        System.out.println(Arrays.toString(array));
    }

    public void reverse(int[] array) {
        for (int startIndex = 0; startIndex < array.length / 2; startIndex++) {
            int endIndex = array.length - 1 - startIndex;
            int temp = array[startIndex];
            array[startIndex] = array[endIndex];
            array[endIndex] = temp;
        }
    }
}
