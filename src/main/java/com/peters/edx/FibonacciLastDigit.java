package com.peters.edx;

import java.util.Scanner;

public class FibonacciLastDigit {

    public static int getFibonacciLastDigitNaive(int n) {
        if (n <= 1)
            return n;

        int previous = 0;
        int current  = 1;

        for (int i = 0; i < n - 1; ++i) {
            int tmp_previous = previous;
            previous = current;
            current = tmp_previous + current;
        }

        return current % 10;
    }

    public static int getFibonacciLastDigitFast(int n) {
        if (n <= 1) return n;

        return ((getFibonacciLastDigitFast(n-1) + getFibonacciLastDigitFast(n -2)) % 10);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = getFibonacciLastDigitNaive(n);
        System.out.println(c);
    }
}