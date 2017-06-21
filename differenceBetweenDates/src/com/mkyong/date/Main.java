package com.mkyong.date;

import org.joda.time.DateTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner date = new Scanner(System.in);

        System.out.println("Please enter Date 1 (MM/dd/yyyy");//gets user input for date
        String date1 = date.nextLine();
        System.out.println("Please enter Date 2 (MM/dd/yyyy");//gets user input for second date
        String date2 = date.nextLine();


        final DateTimeFormatter format = DateTimeFormat.forPattern("MM/dd/yyyy");//formats standard date

        DateTime dt1 = format.parseDateTime(date1); //initializes dates 1 & 2 to dt1 and dt2
        DateTime dt2 = format.parseDateTime(date2);// and breaks up year, month and day

        final Period period = new Period(dt1,dt2);//period specifies duration between dates 1 & 2

        System.out.println(period.getYears() + "years");    //prints out years
        System.out.println(period.getMonths() + "months");  //prints out months
        System.out.println(period.getDays() + " days, ");   //prints out days
    }
}