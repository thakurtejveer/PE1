//6. Write a program that takes a character from the user as input and determines whether the
//character entered is a capital letter, a small case letter, a digit or a special symbol and display
//appropriately.
//Input: A
//Output: Capital letter
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter a letter: ");
        String letter=input.next();
        {
            if(letter.length()>1)
            {
                System.out.println("Oops! you have entered more than one letter, please try again");
                return;
            }
            else if(letter.charAt(0)>=65&&letter.charAt(0)<=90)
            {
                System.out.println("Capital Letter");
            }
            else if(letter.charAt(0)>=97&&letter.charAt(0)<=122)
            {
                System.out.println("a small case letter");
            }
            else if(letter.charAt(0)>=48&&letter.charAt(0)<=57)
            {
                System.out.println("Digital Symbol");
            }
            else
            {
                System.out.println("Special Symbol");
            }
        }
    }
}
