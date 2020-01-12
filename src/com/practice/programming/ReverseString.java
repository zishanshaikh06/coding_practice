package com.practice.programming;

public class ReverseString {

    public static void reverseString(char[] s) {

        int front = 0;
        int back = s.length-1;

        while(front< back){

            char temp = s[front];
            s[front] = s[back];
            s[back] = temp;

            front++;
            back--;

        }

    }

    public static void main(String[] args) {

        char[] arr = {'h', 'e', 'l', 'l', 'o'};

        reverseString(arr);

        for (char c : arr) {
            System.out.print(c + " ");
        }


    }


}
