package io.tince.exercises.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Fizz Buzz
 * <p>
 * Given an integer n, return a string array answer (1-indexed) where:
 * - answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
 * - answer[i] == "Fizz" if i is divisible by 3.
 * - answer[i] == "Buzz" if i is divisible by 5.
 * - answer[i] == i (as a string) if none of the above conditions are true.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * Input: n = 3
 * Output: ["1","2","Fizz"]
 * <p>
 * Example 2:
 * Input: n = 5
 * Output: ["1","2","Fizz","4","Buzz"]
 * <p>
 * Example 3:
 * Input: n = 15
 * Output: ["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */
public class FizzBuzz {
    public static void main(String[] args) {
        System.out.println(fizzBuzz2(3));
        System.out.println(fizzBuzz2(5));
        System.out.println(fizzBuzz2(15));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(String.valueOf(i));
            }
        }
        return result;
    }

    public static List<String> fizzBuzz2(int n) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            boolean divisibleBy3 = i % 3 == 0;
            boolean divisibleBy5 = i % 5 == 0;

            String currentString = "";

            if (divisibleBy3) {
                currentString += "Fizz";
            }

            if (divisibleBy5) {
                currentString += "Buzz";
            }

            if (currentString.isEmpty()) {
                currentString += String.valueOf(i);
            }

            result.add(currentString);
        }
        return result;
    }
}
