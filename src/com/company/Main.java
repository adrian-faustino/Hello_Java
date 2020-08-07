package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = revereString("Adrian");
        String pallindrome = "racecare";
        boolean isPallindrome = checkPallindrome(pallindrome);
        int a = 5;
        int b = 6;
        int sum = addTwoNumbers(a, b);

        int num1 = 36;
        int num2 = 37;
        int num3 = 38;
        System.out.println(greatestNum(num3, num2, num1));
    }

    // reverse string: dog -> god
    public static String revereString(String s) {
        char [] letters = new char[s.length()];

        int letterIndex = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            letters[letterIndex]  = s.charAt(i);
            letterIndex++;
        }

        String reverse = "";
        for (int i = 0; i < s.length(); i++) {
            reverse = reverse + letters[i];
        }

        return reverse;
    }

    // pallindrome: racecar -> racecar
    public static boolean checkPallindrome(String s) {
        String a = s;
        String b = revereString((s));

        if (a.equals(b)) {
            return true;
        } else {
            return false;
        }
    }

    // add 2 numbers
    public static int addTwoNumbers(int a, int b) {
        int result = 0;
        result = a + b;
        return result;
    }

    // odd or even. 35 -> "35 is odd."
    public static String oddOrEven(int num) {
        if (num % 2 == 0) {
            return num + " is even.";
        } else {
            return num + " is odd.";
        }
    }

    // Take three numbers from the user and print the greatest number.
    public static String greatestNum(int a, int b, int c) {
        int greatest = a;
        if (b > a & b > c) {
            greatest = b;
        } else if (c > a & c > b) {
            greatest = c;
        }
        return greatest + " is the greatest number.";
    }
}
