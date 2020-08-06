package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name = revereString("Adrian");
        String pallindrome = "racecare";
        boolean isPallindrome = checkPallindrome(pallindrome);

        System.out.println(isPallindrome);
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
}
