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

public class checkPalindrome {
    public void isPalindrome(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter Number to check palindrome: ");
        long enteredNumber =scanner.nextLong();
        long originalNumber=enteredNumber;
        long palindrome_number=0;
        long sumOfEven=0;
        while(enteredNumber>0)
        {
            palindrome_number = palindrome_number * 10 + enteredNumber % 10;
            if ((enteredNumber % 10) % 2 == 0) {
                sumOfEven +=enteredNumber % 10;
            }
            enteredNumber /= 10;
        }
        if(palindrome_number==originalNumber)
        {
            if(sumOfEven>25)
            {
                System.out.printf("Output : %d is palindrome and the sum of even numbers is greater than 25", originalNumber);
            }
            else
                System.out.printf("Output : %d is palindrome and the sum of even numbers is less than 25", originalNumber);
        }
        else
            System.out.printf("%d is not palindrome", originalNumber);

    }
}
