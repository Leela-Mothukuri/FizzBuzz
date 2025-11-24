package com.example.fizzbuzz;

public class FizzBuzz {
    // Correct FizzBuzz implementation:
    // - If divisible by 3 and 5 -> "FizzBuzz"
    // - Else if divisible by 3 -> "Fizz"
    // - Else if divisible by 5 -> "Buzz"
    // - Otherwise the decimal representation of the number
    public static String evaluate(int n) {
        if (n % 15 == 0) {
            return "FizzBuzz";
        }
        if (n % 3 == 0) {
            return "Fizz";
        }
        if (n % 5 == 0) {
            return "Buzz";
        }
        return String.valueOf(n);
    }
}
