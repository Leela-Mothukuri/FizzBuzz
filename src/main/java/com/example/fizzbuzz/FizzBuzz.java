package com.example.fizzbuzz;

public class FizzBuzz {
    // Minimal implementation to allow tests to compile.
    // This intentionally returns the number as a string so
    // the Cucumber scenarios that expect "Fizz", "Buzz", or
    // "FizzBuzz" will fail — useful for TDD / red-green-refactor.
    public static String evaluate(int n) {
        return String.valueOf(n);
    }
}
