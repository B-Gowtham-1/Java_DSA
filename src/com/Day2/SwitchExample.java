package com.Day2;
import java.util.*;
public class SwitchExample {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        String str=ob.nextLine();
        switch(str){
            case "apple":
                System.out.println("Apple Has Been Selected");
                break;
            case "orange":
                System.out.println("Orange Has Been Selected");
                break;
            case "banana":
                System.out.println("Banana is Been Selected");
                break;
            default:
                System.out.println("Enter a valid Input");
        }
    }
}
