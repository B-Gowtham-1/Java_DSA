package com.Day2;
import java.util.*;
public class WeekDays {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int week=ob.nextInt();
        switch(week) { //This Type of Switch Does not requiure Break
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Enter Proper Number");
        }
     //Simple Switch Example
        switch(week){
            case 1,2,3,4,5 -> System.out.println("WeekDays");
            case 6,7 -> System.out.println("WeekEnd");
        }


    }
}
