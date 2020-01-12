package com.practice.programming;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class SortDates {

    public static List<String> sortDates(List<String> dates) {

        List<Date> list = new ArrayList<>();

        List<String> finalList = new ArrayList<>();

        for (String date : dates) {

            SimpleDateFormat format = new SimpleDateFormat("dd MMM yyyy");

            try {
                Date d = format.parse(date);

                list.add(d);
            } catch (ParseException e) {

            }


        }

        Collections.sort(list);

        for (Date date : list) {
            finalList.add(new SimpleDateFormat("dd MMM yyyy").format(date));
        }


        return finalList;
    }

    public static void main(String[] args) {

        List<String> dates = Arrays.asList("01 Mar 2017", "03 Feb 2017", "15 Jan 1998");

        System.out.println(sortDates(dates));


    }
}
