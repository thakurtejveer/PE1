//6. Write a program that takes a character from the user as input and determines whether the
//character entered is a capital letter, a small case letter, a digit or a special symbol and display
//appropriately.
//Input: A
//Output: Capital letter
package com.company;

import java.util.Scanner;

public class checkLetter {
    public void displayCheckedLetter() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter a letter to get its class: ");
        String enteredLetter=scanner.next();
        {
            if(enteredLetter.length()>1)
            {
                System.out.println("Oops! you have entered more than one letter, please try again");
                return;
            }
            else if(enteredLetter.charAt(0)>=65 && enteredLetter.charAt(0)<=90)
            {
                System.out.println("A Capital Letter");
            }
            else if(enteredLetter.charAt(0)>=97 && enteredLetter.charAt(0)<=122)
            {
                System.out.println("A small case letter");
            }
            else if(enteredLetter.charAt(0)>=48 && enteredLetter.charAt(0)<=57)
            {
                System.out.println("A Digital Symbol");
            }
            else
            {
                System.out.println("A Special Symbol");
            }
        }

    }
}
