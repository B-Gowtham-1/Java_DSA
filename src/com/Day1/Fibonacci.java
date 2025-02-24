package com.Day1;
import java.util.*;
public class Fibonacci {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int n=ob.nextInt();
        int a=0,b=1;
        for(int i=2;i<n;i++){
            int temp=a+b;
            a=b;
            b=temp;
        }
        System.out.println(b);
    }
}
