package com.example.primechecker;

public class PrimeNumberChecker {

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        // Check if the number is less than or equal to 1
        if (number <= 1) {
            return false;
        }

        // Check from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            // If the number is divisible by i, it is not prime
            if (number % i == 0) {
                return false;
            }
        }

        // If no divisors were found, the number is prime
        return true;
    }

    public static void main(String[] args) {
        int[] testNumbers = {1, 2, 3, 4, 5, 16, 17, 18, 19, 20};

        for (int number : testNumbers) {
            System.out.println("Is " + number + " a prime number? " + isPrime(number));
        }
    }
}
