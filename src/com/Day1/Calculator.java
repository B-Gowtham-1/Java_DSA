package com.Day1;
import java.util.*;
public class Calculator {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);

        int ans=0;

        while(true){
            System.out.println("Enter Operator : ");
            char op=ob.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '*' || op == '/' || op == '%'){
                System.out.println("Enter Two Number : ");
                int a=ob.nextInt();
                int b=ob.nextInt();
                if (op == '+') {
                    ans=a+b;
                }
                if (op == '-') {
                    ans=a-b;
                }
                if (op == '*') {
                    ans=a*b;
                }
                if (op == '/') {
                    ans=a+b;
                }
                if (op == '%') {
                    ans=a+b;
                }

            }
            else if(op == 'x' || op == 'X'){
                break;
            }
            else{
                System.out.println("Invalid");
            }
            System.out.println(ans);
            System.out.println("To Exit Enter X or x");
        }
    }
}
