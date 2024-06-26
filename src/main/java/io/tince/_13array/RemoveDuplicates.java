package io.tince._13array;

import java.util.Arrays;

/**
 * Array: Remove Duplicates
 *
 * The task is to write a method named "removeDuplicates", that removes all duplicate occurrences of integers from a sorted array in-place
 * such that each unique element appears only once.
 *
 * The relative order of the elements should be kept the same.
 *
 * The method also needs to return the new length of the array after duplicates have been removed.
 * It's important to note that the array is passed by reference to the function, which means modification to the array will be known to the caller as well.
 *
 * Method Signature: public static int removeDuplicates(int[] nums)
 *
 * This method takes as input an array of integers "nums" and returns an integer.
 *
 * Additional Notes:
 * The method "removeDuplicates" should do this by moving the 'unique' elements to the start of the array
 * and then returning the length of the 'unique' portion of the array.
 * The method should not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory
 * (this means you cannot use another data structure like a set).
 *
 * When the array is empty, the method should return 0.
 *
 * */
public class RemoveDuplicates {
    // WRITE THE REMOVE DUPLICATES METHOD HERE//
    //                                        //
    //                                        //
    //                                        //
    //                                        //
    ////////////////////////////////////////////
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        if (nums.length > 0) index = 1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] != nums[i + 1]) {
                nums[index] = nums[i + 1];
                index++;
            }
        }
        return index;
    }

    // WRITE THE REMOVE DUPLICATES METHOD HERE//
    //                                        //
    //                                        //
    //              SOLUTION - 2              //
    //                                        //
    ////////////////////////////////////////////
    public static int removeDuplicates2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int writePointer = 1;

        for (int readPointer = 1; readPointer < nums.length; readPointer++) {
            if (nums[readPointer] != nums[readPointer - 1]) {
                nums[writePointer] = nums[readPointer];
                writePointer++;
            }
        }

        return writePointer;
    }



    public static void main(String[] args) {

        int[] nums1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int newLength1 = removeDuplicates(nums1);
        System.out.println("Test case 1: New length: " + newLength1);
        System.out.println("Test case 1: Unique values in list: " + Arrays .toString(Arrays.copyOfRange(nums1, 0, newLength1)));

        int[] nums2 = {1, 1, 2};
        int newLength2 = removeDuplicates(nums2);
        System.out.println("Test case 2: New length: " + newLength2);
        System.out.println("Test case 2: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums2, 0, newLength2)));

        int[] nums3 = {-1, 0, 0, 0, 3, 3};
        int newLength3 = removeDuplicates(nums3);
        System.out.println("Test case 3: New length: " + newLength3);
        System.out.println("Test case 3: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums3, 0, newLength3)));

        int[] nums4 = {};
        int newLength4 = removeDuplicates(nums4);
        System.out.println("Test case 4: New length: " + newLength4);
        System.out.println("Test case 4: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums4, 0, newLength4)));

        int[] nums5 = {1, 1, 1, 1, 1};
        int newLength5 = removeDuplicates(nums5);
        System.out.println("Test case 5: New length: " + newLength5);
        System.out.println("Test case 5: Unique values in list: " + Arrays.toString(Arrays.copyOfRange(nums5, 0, newLength5)));

        /*
            EXPECTED OUTPUT:
            ----------------
            Test case 1: New length: 5
            Test case 1: Unique values in list: [0, 1, 2, 3, 4]
            Test case 2: New length: 2
            Test case 2: Unique values in list: [1, 2]
            Test case 3: New length: 3
            Test case 3: Unique values in list: [-1, 0, 3]
            Test case 4: New length: 0
            Test case 4: Unique values in list: []
            Test case 5: New length: 1
            Test case 5: Unique values in list: [1]
        */

    }
}
