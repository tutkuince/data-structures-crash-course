package io.tince.exercises.easy;

/**
 * First Bad Version
 *
 * You are a product manager and currently leading a team to develop a new product. Unfortunately, the latest version of your product fails the quality check.
 * Since each version is developed based on the previous version, all the versions after a bad version are also bad.
 *
 * Suppose you have "n" versions "[1, 2, ..., n] and you want to find out the first bad one, which causes all the following ones to be bad.
 *
 * You are given an API "bool isBadVersion(version)" which returns whether "version" is bad. Implement a function to find the first bad version.
 * You should minimize the number of calls to the API.
 *
 * Example 1:
 *  Input: n = 5, bad = 4
 *  Explanation:
 *  call isBadVersion(3) -> false
 *  call isBadVersion(5) -> true
 *  call isBadVersion(4) -> true
 * Example 2:
 *  Input: n = 1, bad = 1
 *  Output: 1
 *
 * Constraints: 1 <= bad <= n <= 2^31 - 1
 * */
public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(new FirstBadVersion().firstBadVersion(5));
    }

    public int firstBadVersion(int n) {
        int left = 1;
        int right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                if (mid == 1 || (mid - 1 > 0 && !isBadVersion(mid - 1))) {
                    return mid;
                } else {
                    right = mid;
                }
            } else {
                left = mid + 1;
            }
        }
        return left;
    }

    // Brute Force
    public int firstBadVersionBruteForceApproach(int n) {
        for (int i = 1; i < n; i++) {
            if (isBadVersion(i)) return i;
        }
        return 1;
    }

    private boolean isBadVersion(int num) {
        return num >= 4;
    }


}
