package io.tince._10hashtables.interview.questions;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Two Sum
 *
 * Problem: Given an array of integers "nums" and a target integer "target", find the indices of two numbers in the array that add up to the target.
 *
 * Input:
 *  - An array of integers "nums".
 *  - A target integer "target".
 *
 * Output:
 *  - An array of two integers representing the indices of the two numbers in the input array "nums" that add up to the target.
 *  If no two numbers in the input array add up to the target, return an empty array[].
 *
 * Return type: int[]
 *
 * */
public class TwoSum {

    // WRITE THE TWOSUM MEHTOD HERE //
    //                              //
    //                              //
    //                              //
    //                              //
    //////////////////////////////////
    public static int[] twoSum(int[] nums, int target) {
        // Index, Number
        // {3, 3} -> Target: 6
        // {3, 2, 4} -> Target: 6
        // {2, 7, 11, 15} -> Target: 9
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int requiredValue = target - nums[i];
            if (numMap.containsKey(requiredValue)) {
                return new int[]{numMap.get(requiredValue), i};
            }
            numMap.put(nums[i], i);
        }
        return new int[]{};
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{3, 3}, 6)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 10)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 7)));
        System.out.println(Arrays.toString(twoSum(new int[]{1, 2, 3, 4, 5}, 3)));
        System.out.println(Arrays.toString(twoSum(new int[]{}, 0)));

        /*
            EXPECTED OUTPUT:
            ----------------
            [0, 1]
            [1, 2]
            [0, 1]
            []
            [2, 3]
            [0, 1]
            []

        */

    }
}
