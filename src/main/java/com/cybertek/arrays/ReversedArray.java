package com.cybertek.arrays;

import java.util.Arrays;

public class ReversedArray {
    public static void main(String[] args) {

        int[] numbers = {13, 5, 10, 13, 14, 7, 9};

        System.out.println("The order of array before implementation");
        printArray(numbers);

        System.out.println("The reversed order of array after implementation");
        printArray(reversedArray(numbers));


    }

    static int[] reversedArray(int[] array) {
        for (int i = 0, j = 1; i < array.length / 2; i++, j++) {
            array[i] = array[i] + array[array.length - j] - (array[array.length - j] = array[i]);
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
