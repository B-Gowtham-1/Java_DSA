package com.Day1;
import java.util.*;
public class CountOccurrence {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter a Number");
        int num=ob.nextInt();
        System.out.println("Enter occurrence to count  :");
        int occ=ob.nextInt();
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==occ){
                count++;
            }
            num=num/10;
        }
        System.out.println("Number of occurence of "+occ+"is : "+count);
    }
}
