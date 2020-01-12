package com.practice.programming;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ArrayPlusOne {

    public static int[] plusOne(int[] digits) {

        String str = "";

        for (int digit : digits) {
            str += digit;
        }

        BigInteger n = new BigInteger(str);

        n = n.add(new BigInteger("1"));

        LinkedList<BigInteger> stack = new LinkedList<>();

        while(n.compareTo(new BigInteger("0")) == 1){

            stack.push(n.mod(new BigInteger("10")));

            n = n.divide(new BigInteger("10"));
        }

        int[] retArr = new int[stack.size()];

        int count = 0;

        while(!stack.isEmpty()){
            retArr[count++] = stack.pop().intValue();
        }

        return retArr;
    }

    public static void main(String[] args) {

        int[] arr = {9,8,7,6,5,4,3,2,1,0};

        plusOne(arr);
    }

}
