package com.practice.programming;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        StringBuilder sb = new StringBuilder(s);
        String reversed = sb.reverse().toString();

        reversed = reversed.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        System.out.println(s);
        System.out.println(reversed);

        return reversed.equals(s);
    }

    public static void main(String[] args) {
        String s = "a.";
        System.out.println(isPalindrome(s));
    }
}
