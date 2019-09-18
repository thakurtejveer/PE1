package com.company;

import java.util.Scanner;

public class checkGuessNumber {
    public void guessNumber() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number between 1 and 100: ");
        int guessed_number=scanner.nextInt();
        int original_number=58;
        do
        {
            if(guessed_number>original_number && guessed_number<=100)
            {
                System.out.println("Guessed Number is more than original number");
                System.out.println("Guessnew number again: ");
                guessed_number=scanner.nextInt();
            }
            else if(guessed_number<original_number&& guessed_number>=0)
            {
                System.out.println("Guessed Number is less than original number");
                System.out.println("Guess number again: ");
                guessed_number=scanner.nextInt();
            }
            else if(guessed_number==original_number)
            {
                System.out.println("Congratulations! Number guessed matches the original number");
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
