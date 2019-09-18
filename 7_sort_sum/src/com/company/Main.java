//7. Write a program which accepts a number as input from user and perform the following:
//a. sort the number in non-increasing order
//b. after sorting sum all the even numbers, the sum should be greater than 15 .
//c. if sum is more than 15,then print output as true or false.
//Input : 234534
//Output : Sorted number in non-increasing order : 544332
//
//Sum of even numbers : 10
//False
package com.company;

import java.util.Scanner;
import java.util.Collections;
import java.util.Vector;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Your Number: ");
        int Number=input.nextInt();
        int sum=0;
        Vector Digit = new Vector();
        while(Number>0)
        {
            Digit.add(Number % 10);
            if((Number%10)%2==0)
                sum+=Number%10;
            Number = Number / 10;
        }
        Collections.sort(Digit);
        System.out.print("Sorted number in non-increasing order :");
        for(int i=Digit.size()-1;i>=0 ;i--)
        {
            System.out.print(Digit.get(i));
        }
        System.out.println();
        System.out.println("Sum of even Numbers:" +sum);
        if(sum<15)
            System.out.println("false");
        else
            System.out.println("true");


    }
}
