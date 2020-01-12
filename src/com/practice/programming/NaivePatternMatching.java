package com.practice.programming;

public class NaivePatternMatching {

    public static int strStr(String haystack, String needle) {

        for(int i=0;i< haystack.length() - needle.length();i++){
            int j;

            for(j=0;j<needle.length();j++){

                if(haystack.charAt((i+j)) != needle.charAt(j)){
                    break;
                }
            }

            if(j == needle.length()){
                System.out.println(i);
                return i;
            }


        }

        return -1;

    }

    public static void main(String[] args) {
        String haystack = "hello";
        String needle = "ll";

        System.out.println(strStr(haystack, needle));

    }

}
