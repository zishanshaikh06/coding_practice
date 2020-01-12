package com.practice.programming;

import java.util.*;

public class Anagram {

    public static void main(String[] args) {

        List<String> anagramList = Arrays.asList("poke", "pkoe", "okpe", "ekop");

        List<String> result = new ArrayList<>(anagramList);

        for(int i = 0; i < anagramList.size(); i++){

            for(int j=i+1; j<anagramList.size();j++){

                if(isAnagram(anagramList.get(i), anagramList.get(j))){

                    result.remove(anagramList.get(j));

                }

            }

        }

        System.out.println(result.toString());



    }

    static boolean isAnagram(String str1, String str2) {

        String s1 = str1.replaceAll("\\s", "");
        String s2 = str2.replaceAll("\\s", "");
        boolean status = true;
        if (s1.length() != s2.length()) {
            status = false;
        } else {
            char[] ArrayS1 = s1.toLowerCase().toCharArray();
            char[] ArrayS2 = s2.toLowerCase().toCharArray();
            Arrays.sort(ArrayS1);
            Arrays.sort(ArrayS2);
            status = Arrays.equals(ArrayS1, ArrayS2);
        }

        return status;
    }


}
