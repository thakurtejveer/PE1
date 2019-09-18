// 1. Write a program which accepts a number as input and check whether the given number is
//palindrome or not If it is a palindrome then
//a. Add all the even numbers and check whether the sum is more than 25.
//b. Print success and failure messages for all 3 conditions
//Input : 2468642
//Output : 2468642 is palindrome and the sum of even numbers is greater than 25
//Input: 12345
//Output: 12345 is not palindrome
//Input: 12345654321
//Output : 12345654321 is palindrome and sum of even numbers is less than 25
package com.company;

import java.util.Scanner;
import java.io.*;

public class Main {

    public static void main(String[] args)
    {
        System.out.println("Enter Number: ");
        Scanner input =new Scanner(System.in);
        long Number =input.nextLong();
        isPalindrome( Number); //calling method

    }
    public static void isPalindrome(long number)
    {
        long temp=number;
        long palindrome_number=0;
        long sum=0;
        while(number>0)
        {
            palindrome_number = palindrome_number * 10 + number % 10;
            if ((number % 10) % 2 == 0) {
                sum +=number % 10;
            }
            number /= 10;
        }
        if(palindrome_number==temp)
        {
            if(sum>25)
            {
                System.out.printf("Output : %d is palindrome and the sum of even numbers is greater than 25", temp);
            }
            else
                System.out.printf("Output : %d is palindrome and the sum of even numbers is less than 25", temp);
        }
        else
            System.out.printf("%d is not palindrome", temp);
    }
}
