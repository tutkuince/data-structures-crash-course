package io.tince.algorithm.sort.merge;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {1, 3, 4, 2, 10, 7};
        System.out.println(Arrays.toString(mergeSort(array)));  // [1, 2, 3, 4, 7, 10]
    }

    public static int[] mergeSort(int[] array) {
        if (array.length == 1) return array;
        
        int minIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, minIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, minIndex, array.length));

        return merge(left, right);
    }

    // [4, 6, 9] -- [2, 5, 7]
    private static int[] merge(int[] array1, int[] array2) {
        int[] combined = new int[array1.length + array2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < array1.length && j < array2.length) {
            if (array1[i] > array2[j]) {
                combined[index] = array2[j];
                j++;
            } else {
                combined[index] = array1[i];
                i++;
            }
            index++;
        }
        while (i < array1.length) {
            combined[index] = array1[i];
            i++;
            index++;
        }
        while (j < array2.length) {
            combined[index] = array2[j];
            j++;
            index++;
        }
        return combined;
    }
}
