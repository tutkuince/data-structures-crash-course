package io.tince.exercises.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Two Sum
 * <p>
 * Given an array of integers "nums" and an integer "target", return indices of the two numbers such that they add up to "target".
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * You can return the answer in any order.
 * <p>
 * Example 1:
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
 * <p>
 * Example 2:
 * Input: nums = [3, 2, 4], target = 6
 * Output: [1, 2]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1]
 * <p>
 * Example 3:
 * Input: nums = [3, 3], target = 6
 * Output: [0, 1]
 */
public class TwoSum {
    public static void main(String[] args) {
        int[] nums1 = new int[]{2, 7, 11, 15};
        int[] nums2 = new int[]{3, 2, 4};
        int[] nums3 = new int[]{3, 2, 3};

        System.out.println(Arrays.toString(new TwoSum().twoSum(nums1, 9)));
    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int requiredValue = target - nums[i];
            if (numberIndexMap.containsKey(requiredValue))
                return new int[]{numberIndexMap.get(requiredValue), i};
            numberIndexMap.put(nums[i], i);
        }
        return new int[]{};
    }
}
