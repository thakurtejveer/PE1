//10. Write a program for the following condition:
//Given 2 inputs , where input1 is string and input 2 is integer value, the last n characters should
//repeat n number of times in the output String.
//Input1: Stackroute
//Input2: 5
//Output1: Stackrouterouterouterouterouteroute
//
//Input1: Stackroute
//Input2: 2
//Output1: Stackroutetete
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter string: ");
        String string=input.next();
        System.out.println("Enter Number:");
        int Number=input.nextInt();
        System.out.print(string);
        for(int j=0;j<Number;j++)
        {
            for (int i = string.length() - Number; i < string.length(); i++)
            {
                System.out.print(string.charAt(i));
            }
        }
        return;
    }
}
