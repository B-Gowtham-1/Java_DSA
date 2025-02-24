package com.Day2;
import java.util.*;
public class SwitchNested {
    public static void main(String args[]){
        Scanner ob=new Scanner(System.in);
        int empid=ob.nextInt();
        String dep=ob.nextLine();
        switch(empid){
            case 21:
                System.out.println("Elango V");
                switch(dep){
                    case "CSE":
                        System.out.println("CSE DEPARTMENT 3rd YEAR");
                    default:
                        System.out.println("ENTER VALID DEPARTMENT");
                }
            default:
                System.out.println("Enter Proper EmpId");
        }
    }
}
