package io.tince.exercises.easy;

import java.util.Arrays;

/**
 * Plus One
 * You are given a large integer represented as an integer array "digits", where each "digits[i]" is the "i^th" digit of the integer.
 * The digits are ordered from most significant to least significant in left-to-right order. The larger integer does not contain any leading "0"'s.
 * <p>
 * Increment the large integer by one and return the resulting array of digits.
 * <p>
 * Example 1:
 * Input: digits = [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 * Incrementing by one gives 123 + 1 = 124.
 * Thus, the result should be [1,2,4].
 * <p>
 * Example 2:
 * Input: digits = [4,3,2,1]
 * Output: [4,3,2,2]
 * Explanation: The array represents the integer 4321.
 * Incrementing by one gives 4321 + 1 = 4322.
 * Thus, the result should be [4,3,2,2].
 * <p>
 * Example 3:
 * <p>
 * Input: digits = [9]
 * Output: [1,0]
 * Explanation: The array represents the integer 9.
 * Incrementing by one gives 9 + 1 = 10.
 * Thus, the result should be [1,0].
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] digits1 = new int[]{1, 2, 3};
        int[] digits2 = new int[]{4, 3, 2, 1};
        int[] digits3 = new int[]{9};
        int[] digits4 = new int[]{9, 9};
        int[] digits5 = new int[]{8, 9, 9, 9};
        int[] digits6 = new int[]{1, 0, 0, 0, 0};
        int[] digits7 = new int[]{8, 9, 4, 5, 0, 0, 7, 9};
        System.out.println(Arrays.toString(new PlusOne().plusOne(digits7)));
    }

    public int[] plusOne(int[] digits) {
        digits[digits.length - 1]++;
        int carry = 0;
        boolean isNeedNewArray = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i] += carry;
            if (digits[i] % 10 == 0 && digits[i] != 0) {
                if (i == 0) isNeedNewArray = true;
                digits[i] = 0;
                carry = 1;
            } else {
                carry = 0;
            }
        }
        if (isNeedNewArray) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }
        return digits;
    }
}
