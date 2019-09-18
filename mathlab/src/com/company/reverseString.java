package com.company;

import java.util.Scanner;

public class reverseString {
    public void displayReverseString() {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter string which you want to get reversed: ");
        String enteredString=input.nextLine();
        for(int i=enteredString.length()-1;i>=0;i--)
        {
            System.out.print(enteredString.charAt(i));
        }
        return;
    }
}
