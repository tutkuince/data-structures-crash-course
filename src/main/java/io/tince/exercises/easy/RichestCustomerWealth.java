package io.tince.exercises.easy;

import java.util.Arrays;

/**
 * Richest Customer Wealth
 * <p>
 * You are given an "m x n" integer grid "accounts" where accounts[i][j] is the amount of money the "i^th" customer has in the j^th bank.
 * Return the wealth that the richest customer has.
 * <p>
 * A customer's wealth is the amount of money they have in all their bank accounts.
 * The richest customer is the customer that has the maximum wealth.
 * <p>
 * Example 1:
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 * Explanation:
 * 1st customer has wealth = 1 + 2 + 3 = 6
 * 2nd customer has wealth = 3 + 2 + 1 = 6
 * Both customers are considered the richest with a wealth of 6 each, so return 6.
 * <p>
 * Example 2:
 * Input: accounts = [[1,5],[7,3],[3,5]]
 * Output: 10
 * Explanation:
 * 1st customer has wealth = 6
 * 2nd customer has wealth = 10
 * 3rd customer has wealth = 8
 * The 2nd customer is the richest with a wealth of 10.
 * <p>
 * Example 3:
 * Input: accounts = [[2,8,7],[7,1,3],[1,9,5]]
 * Output: 17
 */
public class RichestCustomerWealth {
    public static void main(String[] args) {
        int[][] accounts = new int[][]{{1, 5}, {7, 3}, {3, 5}};
        System.out.println(new RichestCustomerWealth().maximumWealth(accounts));
    }
    // Brute Force
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        for (int[] account : accounts) {
            int sum = 0;
            for (int i : account) {
                sum += i;
            }
            maxWealth = Math.max(maxWealth, sum);
        }
        return maxWealth;
    }

    // Java Streams
    public int maximumWealth2(int[][] accounts) {
        return Arrays.stream(accounts)
                .mapToInt(account -> Arrays.stream(account).sum())
                .max()
                .getAsInt();
    }
}
