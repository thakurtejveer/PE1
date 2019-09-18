//8. Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 -
//100) User should guess until the the target number is guessed correctly.
//Print separate messages for the following:
//a. Number guessed is more than original number
//b. Number guessed is less than original number
//c. Number guessed matches the original number
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number between 1 and 100 :");
        int guessed_number=input.nextInt();
        int original_number=58;
        do
        {
            if(guessed_number>original_number && guessed_number<=100)
            {
                System.out.println("Guessed Number is more than original number");
                System.out.println("Guess number again: ");
                guessed_number=input.nextInt();
            }
            else if(guessed_number<original_number&& guessed_number>=0)
            {
                System.out.println("Guessed Number is less than original number");
                System.out.println("Guess number again: ");
                guessed_number=input.nextInt();
            }
            else if(guessed_number==original_number)
            {
                System.out.println("Number guessed matches the original number");
                return;
            }
            else
            {
                System.out.println("You didn't enter number in range, please try again");
                return;
            }

        }
        while(guessed_number!=original_number);
    }
}
