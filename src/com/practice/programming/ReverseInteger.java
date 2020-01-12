package com.practice.programming;

import java.util.LinkedList;

public class ReverseInteger {

    public static int reverse(int x) {

        StringBuilder builder = new StringBuilder();

        if(x<0){
            builder.append("-");
            x = (x)*(-1);
        }

        if(x< 0 || x < Integer.MIN_VALUE || x>Integer.MAX_VALUE){
            return 0;
        }

        while (x > 0) {

            builder.append(x%10);
            x = x/10;

        }

        try{
            int nm = Integer.parseInt(builder.length() > 0 ? builder.toString():"0");
            return nm;
        }catch (NumberFormatException e){
            return 0;
        }
    }

    public static void main(String[] args) {
        int x = 1534236469;

        reverse(x);

    }


}
