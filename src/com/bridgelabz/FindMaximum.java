package com.bridgelabz;

import java.util.Arrays;

public class FindMaximum <T extends Comparable<T>>{
    T[] array;

    public FindMaximum(T[] array) {
        this.array = array;
    }

    public T maximum() {
        return FindMaximum.maximumNum(array);
    }

    public static <T extends Comparable<T>> T maximumNum(T[] array) {

        for (int i = 0; i < array.length - 1; i++) {

            for (int j = 0; j < array.length - i - 1; j++) {

                if (array[j].compareTo(array[j + 1]) > 0) {

                    T temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array " + Arrays.toString(array));
        System.out.println("Maximum from the above array is " + array[array.length - 1]);
        System.out.println("\n=========================================================================");
        return array[array.length - 1];
    }
}