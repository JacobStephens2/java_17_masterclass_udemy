package net.jacobstephens.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumElement {
    public MinimumElement() {
        int[] numbers = readIntegers();
        System.out.println("Array: " + Arrays.toString(numbers));
        int min = findMin(numbers);
        System.out.printf("The minimum number in this array is %d.", min);
    }

    public int[] readIntegers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a comma delimited list of numbers.");
        String input = scanner.nextLine();
        String[] strings = input.split(",");
        int[] numbers = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            numbers[i] = Integer.parseInt(strings[i]);
        }
        return numbers;
    }

    public int findMin(int[] numbers) {
        int min = Integer.MAX_VALUE;
        System.out.println(min);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
}
