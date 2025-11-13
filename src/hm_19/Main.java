package hm_19;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        // Creating an array of random numbers
        int[] numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
        }

        System.out.println(" Initial array: " + Arrays.toString(numbers));

        // Sorted
        ArrayUtils.mergeSort(numbers);
        System.out.println(" Sorted array: " + Arrays.toString(numbers));

        // Search for a specific number
        int target = numbers[3];
        int index = ArrayUtils.binarySearch(numbers, target);

        if (index != -1) {
            System.out.println(" Number " + target + " found by index " + index);
        } else {
            System.out.println(" Number " + target + " not found.");
        }
    }
}
