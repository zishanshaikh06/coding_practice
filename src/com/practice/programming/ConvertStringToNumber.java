package com.practice.programming;

public class ConvertStringToNumber {

    public static int myAtoi(String str) {

        if (str == null || str.length() <= 0) {
            return 0;
        }

        String[] strArr = str.split("\\.");

        if(strArr.length>0 && !strArr[0].equals("")){
            str = strArr[0];
        }else{
            return 0;
        }

        int i = 0;
        int number = 0;
        boolean negative = false;
        int len = str.length();


        if (Character.isAlphabetic(str.charAt(0)) || str.contains("+-") || str.contains("-+")) {
           return 0;
        }


        while (i < len) {

            if (str.charAt(i) == '-') {
                negative = true;
                i++;
                continue;
            }

            if(Character.isDigit(str.charAt(i))){

                if(number >= Integer.MAX_VALUE){
                    break;
                }

                if((number * 10) < number){
                    number = Integer.MIN_VALUE;
                    break;
                }

                number = number * 10;

                if((number + (str.charAt(i) - '0')) >= Integer.MAX_VALUE){
                    break;
                }

                number = number + (str.charAt(i) - '0');


            }else if(Character.isLetter(str.charAt(i))){

                break;
            }

            i++;
        }

        if(number <= Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }

        if(number > Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }

        if (negative) {
            number = -number;
        }

        return number;
    }

    public static void main(String[] args) {
        String str = "   +0 123";

        System.out.println(myAtoi(str));

    }

}
