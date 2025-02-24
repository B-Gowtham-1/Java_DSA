package com.Day1;
import java.util.*;
public class ReverseNum {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int rev=0;
        int rem=0;
        while(n>0){
           rem=n%10;
           rev=(rev*10)+rem;
           n=n/10;
        }
        System.out.println(rev);
    }
}
